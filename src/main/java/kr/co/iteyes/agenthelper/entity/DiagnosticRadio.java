package kr.co.iteyes.agenthelper.entity;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import kr.co.iteyes.agenthelper.entity.id.DiagnosticRadioId;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "TFN_INSP_RADIO")
@IdClass(DiagnosticRadioId.class)
@Getter
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class DiagnosticRadio {
    @Id
    private String cisn;
    @Id
    private String ciNo;
    @Id
    private Long rcptNo;
    @Id
    private String patId;
    @Id
    private String mediBgngYmd;
    @Id
    private String inspDiv;
    @Id
    private Long rxNo;
    @Id
    private Long seqNo;
    @Id
    private String inspDt;
    @Id
    private String ordInspCd;
    private String inspCd;
    @Id
    private String inspNm;
    private String inspRslt;
    @Id
    private String instpSts;
    private String accNo;
    private String dicom;
    private String drln;
    @Id
    private String drId;
    private String drNm;
    @Id
    private String prctSubjCd;
    private String prctSubjNm;
    private String inspDrln;
    private String inspDrId;
    private String inspDrNm;
    private String inspPrctSubjCd;
    private String inspPrctSubjNm;
    @Id
    private Timestamp lastChgDt;
}
