package kr.co.iteyes.agenthelper.entity;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import kr.co.iteyes.agenthelper.entity.id.ConditionId;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * NOT NULL 로 정의된 모든 필드에 @Id 지정
 */

@Entity
@Table(name = "TFN_DIAG")
@IdClass(ConditionId.class)
@Getter
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Condition {
    @Id
    private Long seqNo;
    private Long rcptNo;
    @Id
    private String patId;
    private String drId;
    private String diagYmd;
    private String diagCd;
    private String diagNm;
    private String diagTxt;
    private String diagStcd;
    private String diagccDiv;
    private String mediBgngYmd;
    private String mediEndYmd;
    private Timestamp lastChgDt;
}
