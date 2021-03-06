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
    private Long rcptNo;
    @Id
    private Long mediBgngYmd;
    @Id
    private String patId;
    @Id
    private Long srgDt;
    @Id
    private String srgCd;
    @Id
    private String srgNm;
    @Id
    private String anesKndCd;
    @Id
    private String anesKndNm;
    @Id
    private String drId;
    private String srgDrId;
    private String srgSt;
    @Id
    private Timestamp lastChgDt;
}
