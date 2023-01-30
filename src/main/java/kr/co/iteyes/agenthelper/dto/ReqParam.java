package kr.co.iteyes.agenthelper.dto;

import kr.co.iteyes.agenthelper.entity.enums.ReqType;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

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

    public String getRcptNo() {
        try {
            Long.parseLong(rcptNo);
            return rcptNo;
        } catch (Exception e) {
            return "0";
        }
    }
}
