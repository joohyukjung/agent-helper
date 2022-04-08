package kr.co.iteyes.agenthelper.entity.id;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@EqualsAndHashCode
@NoArgsConstructor
public class DiagnosticPathoId implements Serializable {
    private Long rcptNo;
    private String patId;
    private String mediBgngYmd;
    private String inspDiv;
    private Long rxNo;
    private String inspDt;
    private Timestamp lastChgDt;
}
