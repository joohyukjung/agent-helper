package kr.co.iteyes.agenthelper.entity.id;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@EqualsAndHashCode
@NoArgsConstructor
public class DiagnosticPathoId implements Serializable {
    private String cisn;
    private String ciNo;
    private Long rcptNo;
    private String patId;
    private String mediBgngYmd;
    private String inspDiv;
    private Long rxNo;
    private Long seqNo;
    private String inspDt;
    private String ordInspCd;
    private String inspNm;
    private String inspRslt;
    private String instpSts;
    private String drId;
    private String drNm;
    private Timestamp lastChgDt;
}
