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
    private Long seqNo;
    private Long rcptNo;
    @Id
    private String patId;
    private String inspDiv;
    private Timestamp inspDt;
    private String inspCd;
    private String inspNm;
    private String inspTxt;
    private String inspRslt;
    private String instpSts;
    private String accNo;
    private String dicom;
    private String drId;
    private String inspDrId;
    private Timestamp lastChgDt;
}
