package kr.co.iteyes.agenthelper.entity.id;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@EqualsAndHashCode
@NoArgsConstructor
public class ObservationLabId implements Serializable {
    private String cisn;
    private String ciNo;
    private Long rcptNo;
    private String patId;
    private String mediBgngYmd;
    private String inspDiv;
    private Long rxNo;
    private Long seqNo;
    private String inspDt;
    private String rsltNo;
    private Long rsltSeqNo;
    private String inspNm;
    private Timestamp lastChgDt;
}
