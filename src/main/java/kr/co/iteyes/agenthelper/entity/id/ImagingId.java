package kr.co.iteyes.agenthelper.entity.id;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@EqualsAndHashCode
@NoArgsConstructor
public class ImagingId implements Serializable {
    private String cisn;
    private String ciNo;
    private Long rcptNo;
    private String patNo;
    private String mediBgngYmd;
    private String inspDiv;
    private String inspDtm;
    private String ordInspCd;
    private String instpSts;
    private String modalCd;
    private String dscrp;
    private String bodySiteCd;
    private Timestamp lastChgDt;
}
