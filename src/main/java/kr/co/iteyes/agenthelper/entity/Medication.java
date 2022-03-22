package kr.co.iteyes.agenthelper.entity;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import kr.co.iteyes.agenthelper.entity.id.MedicationId;
import lombok.Getter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "TFN_PSCRIP")
@IdClass(MedicationId.class)
@Getter
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Medication {
    @Id
    private String cisn;
    @Id
    private String ciNo;
    @Id
    private Long rcptNo;
    @Id
    private String mediBgngYmd;
    @Id
    private String patId;
    @Id
    private Long rxNo;
    @Id
    private Long seqNo;
    @Id
    private String rxDt;
    @Id
    private String rxCd;
    private String rxNm;
    private String cnptCd;
    private String cnptNm;
    private String usge;
    private String medcChlCd;
    private String medcChlNm;
    private Long onceDoseQty;
    private String unit;
    @Id
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
    @Id
    private Timestamp lastChgDt;
}
