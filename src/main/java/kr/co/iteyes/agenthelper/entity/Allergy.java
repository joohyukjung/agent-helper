package kr.co.iteyes.agenthelper.entity;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import kr.co.iteyes.agenthelper.entity.id.AllergyId;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "TFN_ALGY")
@Getter
@IdClass(AllergyId.class)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Allergy {
    @Id
    private String cisn;
    @Id
    private String ciNo;
    @Id
    private Long rcptNo;
    @Id
    private String patId;
    @Id
    private String mediBgngYmd;
    @Id
    private String alrgCozDivCd;
    private String alrgCozDivNm;
    @Id
    private String alrgCozCd;
    @Id
    private String alrgCozNm;
    @Id
    private String nowStsCd;
    private String nowStsNm;
    @Id
    private Timestamp lastChgDt;
}
