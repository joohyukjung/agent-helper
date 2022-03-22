package kr.co.iteyes.agenthelper.entity;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import kr.co.iteyes.agenthelper.entity.id.DiagnosticPathoId;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "TFN_INSP_PATHO")
@IdClass(DiagnosticPathoId.class)
@Getter
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class DiagnosticPatho {
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
    private String inspDt;
    private String bxNo;
    private String ordInspCd;
    private String inspCd;
    private String inspNm;
    private String smplCd;
    private String smplNm;
    private String inspRslt;
    private String instpSts;
    private String imgRef;
    private String drln;
    private String drId;
    private String drNm;
    private String prctSubjCd;
    private String prctSubjNm;
    @Id
    private Timestamp lastChgDt;
}
