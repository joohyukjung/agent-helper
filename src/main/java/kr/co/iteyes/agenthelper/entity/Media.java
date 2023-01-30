package kr.co.iteyes.agenthelper.entity;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import kr.co.iteyes.agenthelper.entity.id.MediaId;
import lombok.Getter;

import javax.persistence.*;
import java.sql.Blob;
import java.sql.Timestamp;

@Entity
@Table(name = "TFN_INSP_IMG")
@IdClass(MediaId.class)
@Getter
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Media {
    @Id
    private Long seqNo;
    private Long rcptNo;
    @Id
    private String patNo;
    private String createStat;
    private String creatDt;
    private String refTypeCd;
    private String refTypeNm;
    private String refTypeDesc;
    private String modalCd;
    private String modalNm;
    private String modalTxt;
    private String eqpTypeDesc;
    private String bodySiteCd;
    private String bodySiteNm;
    private String bodyTypeDesc;
    @Lob
    private Blob refData;
    private Timestamp lastChgDt;
}
