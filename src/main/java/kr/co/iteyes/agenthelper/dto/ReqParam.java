package kr.co.iteyes.agenthelper.dto;

import kr.co.iteyes.agenthelper.entity.enums.ReqType;
import kr.co.iteyes.agenthelper.exception.ResourceNotValidException;
import lombok.Data;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import javax.validation.ConstraintViolationException;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@Data
public class ReqParam implements Serializable {

    @NotNull
    private ReqType reqType;

    private String id;

    @Size(min = 8, max = 8)
    private String startDate;

    @Size(min = 8, max = 8)
    private String endDate;

    public String getStartDate() {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").format(new SimpleDateFormat("yyyyMMdd").parse(startDate));
        } catch (ParseException e) {
            throw new ResourceNotValidException(e.getMessage());
        } catch (NullPointerException e) {
            throw new ResourceNotValidException("널이어서는 안됩니다 [startDate]");
        }
    }

    public String getEndDate() {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").format(new SimpleDateFormat("yyyyMMdd").parse(endDate));
        } catch (ParseException e) {
            throw new ResourceNotValidException(e.getMessage());
        } catch (NullPointerException e) {
            throw new ResourceNotValidException("널이어서는 안됩니다 [endDate]");
        }
    }
}
