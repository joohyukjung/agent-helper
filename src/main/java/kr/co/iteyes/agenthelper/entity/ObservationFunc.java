package kr.co.iteyes.agenthelper.entity;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import kr.co.iteyes.agenthelper.entity.id.ObservationFuncId;
import lombok.Getter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "TFN_INSP_FUNC")
@IdClass(ObservationFuncId.class)
@Getter
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ObservationFunc {
    @Id
    private Long seqNo;
    private Long rcptNo;
    @Id
    private String patId;
    private String inspDiv;
    private String inspDt;
    private String inspCd;
    private String inspNm;
    private String inspTxt;
    private String inspRslt;
    private String unit;
    private String absnRsnCd;
    private String absnRsnNm;
    private String upRefVal;
    private String upRefUnit;
    private String lwerRefVal;
    private String lwerRefUnit;
    private String img;
    private String drId;
    private String instpSts;
    private Timestamp lastChgDt;
}
