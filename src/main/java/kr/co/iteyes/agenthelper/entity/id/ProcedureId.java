package kr.co.iteyes.agenthelper.entity.id;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@EqualsAndHashCode
@NoArgsConstructor
public class ProcedureId implements Serializable {
    private Long rcptNo;
    private Long mediBgngYmd;
    private String patId;
    private Long srgDt;
    private String srgCd;
    private String srgNm;
    private String anesKndCd;
    private String anesKndNm;
    private String drId;
    private Timestamp lastChgDt;
}
