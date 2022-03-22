package kr.co.iteyes.agenthelper.entity.id;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;
import java.sql.Timestamp;

@EqualsAndHashCode
@NoArgsConstructor
public class MedicationId implements Serializable {
    private String cisn;
    private String ciNo;
    private Long rcptNo;
    private String mediBgngYmd;
    private String patId;
    private Long rxNo;
    private Long seqNo;
    private String rxDt;
    private String rxCd;
    @Column(name = "DAY1_MEDC_CNT")
    private Long day1MedcCnt;
    private Timestamp lastChgDt;
}
