package kr.co.iteyes.agenthelper.entity.id;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@EqualsAndHashCode
@NoArgsConstructor
public class MediaId implements Serializable {
    private Long rcptNo;
    private String patNo;
    private String mediBgngYmd;
    private String createStat;
    private String createStatNm;
    private Date createDtm;
    private String refTypeCd;
    private String eqpTypeCd;
    private String bodySiteCd;
    private Timestamp lastChgDt;
}
