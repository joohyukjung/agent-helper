package kr.co.iteyes.agenthelper.exception.error;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;
import lombok.Data;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;

import java.util.Date;

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
}
