package kr.co.iteyes.agenthelper.entity;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import kr.co.iteyes.agenthelper.entity.id.ImagingId;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "TFN_INSP_DICOM")
@IdClass(ImagingId.class)
@Getter
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Imaging {
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
    private String inspDtm;
    @Id
    private String ordInspCd;
    private String inspCd;
    private String inspNm;
    private String accNo;
    private String dicom;
    @Id
    private String instpSts;
    @Id
    private String modalCd;
    private String modalNm;
    @Id
    private String dscrp;
    @Id
    private String bodySiteCd;
    private String bodySiteNm;
    @Id
    private Timestamp lastChgDt;
}
