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
    private String rxCd;
    @Id
    private String rxNm;
    private String cnptCd;
    private String cnptNm;
    @Id
    private String usge;
    @Id
    private String medcChlCd;
    @Id
    private String medcChlNm;
    @Id
    private Long onceDoseQty;
    @Id
    private String unit;
    @Id
    @Column(name = "DAY1_MEDC_CNT")
    private Long day1MedcCnt;
    @Id
    private Long medcDays;
    private String drln;
    @Id
    private String drId;
    private String drNm;
    @Id
    private String prctSubjCd;
    private String prctSubjNm;
    @Id
    private String rxSts;
    @Id
    private String dmndSts;
    @Id
    private String selfYn;
    @Id
    private Timestamp lastChgDt;
}
