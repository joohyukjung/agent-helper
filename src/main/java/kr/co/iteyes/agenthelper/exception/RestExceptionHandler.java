package kr.co.iteyes.agenthelper.exception;

import kr.co.iteyes.agenthelper.exception.error.ApiError;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.beans.TypeMismatchException;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.async.AsyncRequestTimeoutException;
import org.springframework.web.multipart.support.MissingServletRequestPartException;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Iterator;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@Slf4j
@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleBindException(BindException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        log.error(ex.getMessage(), ex);
        ApiError apiError = new ApiError(BAD_REQUEST, request.getDescription(false));
        apiError.setMessage("Resource is not valid.");
        apiError.addValidationErrors(ex.getBindingResult().getFieldErrors());
        apiError.addValidationError(ex.getBindingResult().getGlobalErrors());
        return buildResponseEntity(apiError, request);
    }

    /**
     * Resource Not Valid error
     * @param ex the ResourceNotValidException
     * @param request
     * @return the ApiError object
     */
    @ExceptionHandler(ResourceNotValidException.class)
    protected ResponseEntity<Object> handleResourceNotValidException(ResourceNotValidException ex, WebRequest request) {
        log.error(ex.getMessage(), ex);
        ApiError apiError = new ApiError(BAD_REQUEST, request.getDescription(false));
        System.out.println(ex.getLocalizedMessage());
        apiError.setMessage(ex.getMessage());
        return buildResponseEntity(apiError, request);
    }

    private ResponseEntity<Object> buildResponseEntity(ApiError apiError, WebRequest request) {
        ServletWebRequest req = ((ServletWebRequest) request);
        apiError.setHttpMethod(req.getHttpMethod());
        Iterator<String> iter = req.getHeaderNames();
        while(iter.hasNext()) {
            String name = iter.next();
            log.info("header: {} >> {}", name, req.getHeaderValues(name));
        }

        iter = req.getParameterNames();
        while(iter.hasNext()) {
            String name = iter.next();
            log.info("params {} >> {}", name, req.getParameterValues(name));
        }
        return ResponseEntity.status(apiError.getStatus()).body(apiError);
    }
}
