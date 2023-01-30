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
    private Long seqNo;
    private Long rcptNo;
    @Id
    private String patId;
    private String inspDiv;
    private String inspDt;
    private String inspCd;
    private String inspNm;
    private String inspTxt;
    private String inspRslt;
    private String instpSts;
    private String imgRef;
    private String drId;
    private Timestamp lastChgDt;
}
