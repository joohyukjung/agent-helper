package kr.co.iteyes.agenthelper.exception;

import kr.co.iteyes.agenthelper.exception.error.ApiError;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Iterator;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@Slf4j
@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
    /**
     * Resource Not Valid error
     * @param ex the ResourceNotValidException
     * @param request
     * @return the ApiError object
     */
    @ExceptionHandler(ResourceNotValidException.class)
    protected ResponseEntity<Object> handleResourceNotValidException(ResourceNotValidException ex, WebRequest request) {
        log.error(ex.getMessage(), ex);
        ApiError error = new ApiError(BAD_REQUEST, request.getDescription(false));
        error.setMessage("Resource is not valid.");
        return buildResponseEntity(error, request);
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
