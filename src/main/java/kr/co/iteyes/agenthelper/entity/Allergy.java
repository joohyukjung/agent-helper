package kr.co.iteyes.agenthelper.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "TFN_ALGY")
@Getter
public class Allergy {
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cisn;
    private String rrno;
    private Long rcptNo;
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
