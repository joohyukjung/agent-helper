package kr.co.iteyes.agenthelper.entity;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import kr.co.iteyes.agenthelper.entity.id.MediaId;
import lombok.Getter;

import javax.persistence.*;
import java.sql.Blob;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "TFN_INSP_IMG")
@IdClass(MediaId.class)
@Getter
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Media {
    @Id
    private Long rcptNo;
    @Id
    private String patNo;
    @Id
    private String mediBgngYmd;
    private String imgRef;
    @Id
    private String createStat;
    @Id
    private String createStatNm;
    @Id
    private Date createDtm;
    @Id
    private String refTypeCd;
    private String refTypeNm;
    private String refTypeDesc;
    @Id
    private String eqpTypeCd;
    private String eqpTypeNm;
    private String eqpTypeDesc;
    @Id
    private String bodySiteCd;
    private String bodySiteNm;
    private String bodyTypeDesc;
    @Lob
    private Blob refData;
    @Id
    private Timestamp lastChgDt;
}
