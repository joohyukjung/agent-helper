package kr.co.iteyes.agenthelper.entity;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import kr.co.iteyes.agenthelper.entity.id.ObservationLabId;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@Table(name = "TFN_INSP_LAB")
@IdClass(ObservationLabId.class)
@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ObservationLab {
    @Id
    private BigInteger seqNo;
    private BigInteger rcptNo;
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
