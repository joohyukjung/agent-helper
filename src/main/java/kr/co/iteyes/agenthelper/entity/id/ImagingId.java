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
    private String patId;
    private String mediBgngYmd;
    private String inspDiv;
    private String inspDt;
    private String inspNm;
    private String dicom;
    private String instpSts;
    private String modalCd;
    private String dscrp;
    private Timestamp lastChgDt;
}