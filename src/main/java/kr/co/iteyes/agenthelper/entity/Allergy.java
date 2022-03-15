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
    private String alrgCozDivCd;
    private String alrgCozDivNm;
    private String alrgCozCd;
    private String alrgCozNm;
    private String nowStsCd;
    private String nowStsNm;
    private String alrgRspmtrlCd;
    private String alrgRspmtrlNm;
    private String drln;
    @Id
    private String drId;
    private String drNm;
    @Id
    private String prctSubjCd;
    @Id
    private String prctSubjNm;
    @Id
    private Timestamp lastChgDt;
}
