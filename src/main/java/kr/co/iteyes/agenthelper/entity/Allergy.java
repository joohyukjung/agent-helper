package kr.co.iteyes.agenthelper.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "TFN_ALGY")
@Getter
public class Allergy {
    private String cisn;
    private String rrno;
    private Long rcptNo;
    @Id
    private String patId;
    private Date mediBgngYmd;
    private String alrgCozDivCd;
    private String alrgCozDivNm;
    private String alrgCozCd;
    private String alrgCozNm;
    private String nowStsCd;
    private String nowStsNm;
    private Timestamp lastChgDt;
}
