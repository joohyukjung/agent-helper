package kr.co.iteyes.agenthelper.entity;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import kr.co.iteyes.agenthelper.entity.id.ObservationFuncId;
import lombok.Getter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "TFN_INSP_FUNC")
@IdClass(ObservationFuncId.class)
@Getter
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ObservationFunc {
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
    @Id
    private String rsltNo;
    @Id
    private Long rsltSeqNo;
    private String smplCd;
    private String smplNm;
    private String ordInspCd;
    private String inspCd;
    private String inspNm;
    private String inspRslt;
    private String unit;
    private String absnRsnCd;
    private String absnRsnNm;
    private String upRefVal;
    private String upRefUnit;
    private String lwerRefVal;
    private String lwerRefUnit;
    private String dtlInspCd;
    private String dtlInspNm;
    private String dtlRsltValu;
    private String dtlUnit;
    @Column(name = "DTL_A6BSN_RSN_CD")
    private String dtlA6bsnRsnCd;
    private String dtlAbsnRsnNm;
    private String dtlUpRefVal;
    private String dtlUpRefUnit;
    private String dtlLwerRefVal;
    private String dtlLwerRefUnit;
    private String img;
    private String drln;
    private String drId;
    private String drNm;
    private String prctSubjCd;
    private String prctSubjNm;
    private String instpSts;
    @Id
    private Timestamp lastChgDt;
}
