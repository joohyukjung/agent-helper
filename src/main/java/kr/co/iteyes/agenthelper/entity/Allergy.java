package kr.co.iteyes.agenthelper.entity;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import kr.co.iteyes.agenthelper.entity.id.AllergyId;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@Table(name = "TFN_ALGY")
@Getter
@IdClass(AllergyId.class)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Allergy {
    @Id
    private BigInteger seqNo;
    private BigInteger rcptNo;
    @Id
    private String patId;
    private String alrgDt;
    private String mediBgngYmd;
    private String alrgCozDivCd;
    private String alrgCozDivNm;
    private String alrgCozCd;
    private String alrgCozNm;
    private String alrgCozTxt;
    private String nowStsCd;
    private String nowStsNm;
    private String drNote;
    private String drId;
    private Timestamp lastChgDt;
}
