package kr.co.iteyes.agenthelper.exception.error;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;
import lombok.Data;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeIdResolver(LowerCaseClassNameResolver.class)
public class ApiError {
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private final Date timestamp;
    private int status;
    private String error;
    private String message;
    private String path;
    private HttpMethod httpMethod;
    private List<ApiSubError> subErrors;


    public ApiError(HttpStatus status, String path) {
        this.status = status.value();
        this.error = status.getReasonPhrase();
        this.path = path;
        this.timestamp = new Date();
    }

    public String getPath() {
        if(path == null) return "";
        return path.substring(path.indexOf("/"));
    }

    public String getMessage() {
        return (message == null) ? "No message available" : message;
    }

    private void addSubError(ApiSubError subError) {
        if (subErrors == null) {
            subErrors = new ArrayList<>();
        }
        subErrors.add(subError);
    }

    private void addValidationError(String object, String field, Object rejectedValue, String message) {
        addSubError(new ApiValidationError(object, field, rejectedValue, message));
    }

    private void addValidationError(String object, String message) {
        addSubError(new ApiValidationError(object, message));
    }

    private void addValidationError(FieldError fieldError) {
        this.addValidationError(
                fieldError.getObjectName(),
                fieldError.getField(),
                fieldError.getRejectedValue(),
                fieldError.getDefaultMessage());
    }

    public void addValidationErrors(List<FieldError> fieldErrors) {
        fieldErrors.forEach(this::addValidationError);
    }

    private void addValidationError(ObjectError objectError) {
        this.addValidationError(
                objectError.getObjectName(),
                objectError.getDefaultMessage());
    }

    public void addValidationError(List<ObjectError> globalErrors) {
        globalErrors.forEach(this::addValidationError);
    }
}
