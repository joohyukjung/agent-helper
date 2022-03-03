package kr.co.iteyes.agenthelper.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "TFN_INSP_RADIO")
@Getter
public class DiagnosticRadio {
    private String cisn;
    private String rrno;
    private Long rcptNo;
    @Id
    private String patNo;
    private Date mediBgngYmd;
    private String inspDiv;
    private Long rxNo;
    private Date inspDtm;
    private String ordInspCd;
    private String inspCd;
    private String inspNm;
    private String inspRslt;
    private String instpSts;
    private String accNo;
    private String dicom;
    private Long drln;
    private String drId;
    private String drNm;
    private String prctSubjCd;
    private String prctSubjNm;
    private Timestamp lastChgDt;
}
