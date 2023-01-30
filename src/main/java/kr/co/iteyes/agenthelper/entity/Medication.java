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
    private Long seqNo;
    @Id
    private Long rcptNo;
    private Long mediBgngYmd;
    @Id
    private String patId;
    private String rxDt;
    private String rxCd;
    private String rxNm;
    private String usge;
    private String medcChlCd;
    private String medcChlNm;
    private String medcChlTxt;
    private Long onceDoseQty;
    private String unit;
    @Column(name = "DAY1_MEDC_CNT")
    private Long day1MedcCnt;
    private Long medcDays;
    private String drId;
    private String rxSts;
    private String dmndSts;
    private String selfYn;
    @Id
    private Timestamp lastChgDt;
}
