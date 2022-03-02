package kr.co.iteyes.agenthelper.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "TFN_PSCRIP")
@Getter
public class Medication {
    private String cisn;
    private String rrno;
    private Long rcptNo;
    private Date mediBgngYmd;
    @Id
    private String patId;
    private Long rxNo;
    private Long seqNo;
    private Date rxDt;
    private String rxCd;
    private String rxNm;
    private String cnptCd;
    private String cnptNm;
    private String usge;
    private String medcChlCd;
    private String medcChlNm;
    private Long onceDoseQty;
    private String unit;
    @Column(name = "DAY1_MEDC_CNT")
    private Long day1MedcCnt;
    private Long medcDays;
    private String drln;
    private String drId;
    private String drNm;
    private String prctSubjCd;
    private String prctSubjNm;
    private String rxSts;
    private String dmndSts;
    private String selfYn;
    private Timestamp lastChgDt;
}
