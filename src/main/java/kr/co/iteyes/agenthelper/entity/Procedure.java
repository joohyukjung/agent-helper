package kr.co.iteyes.agenthelper.entity;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import kr.co.iteyes.agenthelper.entity.id.ProcedureId;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "TFN_SURGERY")
@IdClass(ProcedureId.class)
@Getter
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Procedure {
    @Id
    private String cisn;
    @Id
    private String ciNo;
    @Id
    private Long receptNo;
    @Id
    private String mediBgngYmd;
    @Id
    private String patId;
    @Id
    private String srgDt;
    private String srgCd;
    @Id
    private String srgNm;
    private String anesKndCd;
    private String anesKndNm;
    private String drln;
    @Id
    private String drId;
    private String drNm;
    @Id
    private String prctSubjCd;
    @Id
    private String prctSubjNm;
    private String srgDrln;
    private String srgDrId;
    private String srgDrNm;
    private String srgPrctSubjCd;
    private String srgPrctSubjNm;
    @Id
    private String srgSt;
    @Id
    private Timestamp lastChgDt;
}
