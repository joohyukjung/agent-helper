package kr.co.iteyes.agenthelper.entity.id;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@EqualsAndHashCode
@NoArgsConstructor
public class ProcedureId implements Serializable {
    private String cisn;
    private String ciNo;
    private Long rcptNo;
    private Long mediBgngYmd;
    private String patId;
    private Long srgDt;
    private String srgCd;
    private String srgNm;
    private String anesKndCd;
    private String anesKndNm;
    private String drln;
    private String drId;
    private String drNm;
    private String prctSubjCd;
    private String prctSubjNm;
    private Timestamp lastChgDt;
}
