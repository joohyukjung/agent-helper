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
    private Long receptNo;
    private String mediBgngYmd;
    private String patId;
    private String srgDt;
    private String srgNm;
    private String drId;
    private String prctSubjCd;
    private String prctSubjNm;
    private String srgSt;
    private Timestamp lastChgDt;
}
