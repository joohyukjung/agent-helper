package kr.co.iteyes.agenthelper.dto;

import kr.co.iteyes.agenthelper.entity.enums.ReqType;
import kr.co.iteyes.agenthelper.exception.ResourceNotValidException;
import lombok.Data;

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

    private String rcptNo;

//    public String getStartDate() {
//        try {
//            return new SimpleDateFormat("yyyy-MM-dd").format(new SimpleDateFormat("yyyyMMdd").parse(startDate));
//        } catch (ParseException e) {
//            throw new ResourceNotValidException(e.getMessage());
//        } catch (NullPointerException e) {
//            throw new ResourceNotValidException("must not be null: startDate");
//        }
//    }
//
//    public String getEndDate() {
//        try {
//            return new SimpleDateFormat("yyyy-MM-dd").format(new SimpleDateFormat("yyyyMMdd").parse(endDate));
//        } catch (ParseException e) {
//            throw new ResourceNotValidException(e.getMessage());
//        } catch (NullPointerException e) {
//            throw new ResourceNotValidException("must not be null: endDate");
//        }
//    }

    public String getRcptNo() {
        try {
            Long.parseLong(rcptNo);
            return rcptNo;
        } catch (Exception e) {
            return "0";
        }
    }
}
