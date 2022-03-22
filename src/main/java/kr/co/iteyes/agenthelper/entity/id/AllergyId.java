package kr.co.iteyes.agenthelper.entity.id;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@EqualsAndHashCode
@NoArgsConstructor
public class AllergyId implements Serializable {
    private String cisn;
    private String ciNo;
    private Long rcptNo;
    private String patId;
    private String mediBgngYmd;
    private String alrgCozDivCd;
    private String alrgCozCd;
    private String alrgCozNm;
    private String nowStsCd;
    private Timestamp lastChgDt;
}
