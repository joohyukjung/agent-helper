package kr.co.iteyes.agenthelper.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "TFN_INSP_LAB")
@Getter
public class ObservationLab {
    private String cisn;
    private String rrno;
    private Long rcptNo;
    @Id
    private String patId;
    private Date mediBgngYmd;
    private String inspDiv;
    private Long rxNo;
    private Date inspDtm;
    private String rsltNo;
    private Long rsltSeqNo;
    private String smplCd;
    private String smplNm;
    private String ordInspCd;
    private String inspCd;
    private String inspNm;
    private String inspRslt;
    private String unit;
    private String absnRsnCd;
    private String absnRsnNm;
    private String upRefVal;
    private String upRefUnit;
    private String lwerRefVal;
    private String lwerRefUnit;
    private String dtlInspCd;
    private String dtlInspNm;
    private String dtlRsltValu;
    private String dtlUnit;
    @Column(name = "DTL_A6BSN_RSN_CD")
    private String dtlA6bsnRsnCd;
    private String dtlAbsnRsnNm;
    private String dtlUpRefVal;
    private String dtlUpRefUnit;
    private String dtlLwerRefVal;
    private String dtlLwerRefUnit;
    private String img;
    private Long drln;
    private String drId;
    private String drNm;
    private String prctSubjCd;
    private String prctSubjNm;
    private String instpSts;
    private Timestamp lastChgDt;
}
