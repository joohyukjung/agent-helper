package kr.co.iteyes.agenthelper.entity;


import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "TFN_INSP_DICOM")
@Getter
public class Imaging {
    private String cisn;
    private String rrno;
    private Long rcptNo;
    @Id
    private String patNo;
    private Date mediBgngYmd;
    private String inspDiv;
    private Date inspDtm;
    private String ordInspCd;
    private String inspCd;
    private String inspNm;
    private String accNo;
    private String dicom;
    private String instpSts;
    private String modalCd;
    private String modalNm;
    private String dscrp;
    private String bodySiteCd;
    private String bodySiteNm;
    private Timestamp lastChgDt;
}
