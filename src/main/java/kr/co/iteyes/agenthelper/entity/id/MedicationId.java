package kr.co.iteyes.agenthelper.entity.id;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@EqualsAndHashCode
@NoArgsConstructor
public class MedicationId implements Serializable {
    private Long rcptNo;
    private Long mediBgngYmd;
    private String patId;
    private Long rxNo;
    private Long seqNo;
    private String rxDt;
    private String rxCd;
    private Long onceDoseQty;
    private Timestamp lastChgDt;
}
