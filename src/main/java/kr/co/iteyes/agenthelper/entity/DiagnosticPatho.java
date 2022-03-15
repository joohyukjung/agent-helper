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
    private Long seqNo;
    @Id
    private String inspDt;
    private String bxNo;
    @Id
    private String ordInspCd;
    private String inspCd;
    @Id
    private String inspNm;
    private String smplCd;
    private String smplNm;
    @Id
    private String inspRslt;
    @Id
    private String instpSts;
    private String imgRef;
    private String drln;
    @Id
    private String drId;
    @Id
    private String drNm;
    private String prctSubjCd;
    private String prctSubjNm;
    @Id
    private Timestamp lastChgDt;
}
