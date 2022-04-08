package kr.co.iteyes.agenthelper.entity.id;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@EqualsAndHashCode
@NoArgsConstructor
public class ObservationFuncId implements Serializable {
    private Long rcptNo;
    private String patNo;
    private String mediBgngYmd;
    private String inspDiv;
    private Long rxNo;
    private String inspDtm;
    private String rsltNo;
    private Long rsltSeqNo;
    private Timestamp lastChgDt;
}
