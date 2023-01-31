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
    private Long seqNo;
    private Long rcptNo;
    @Id
    private String patId;
    private Timestamp srgDt;
    private String srgCd;
    private String srgNm;
    private String srgTxt;
    private String drId;
    private String srgSt;
    private Timestamp lastChgDt;
}
