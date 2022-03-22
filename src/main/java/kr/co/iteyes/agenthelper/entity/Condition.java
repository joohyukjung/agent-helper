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
    private String cisn;
    @Id
    private String ciNo;
    @Id
    private Long rcptNo;
    @Id
    private String patId;
    @Id
    private String drln;
    @Id
    private String drId;
    private String drNm;
    @Id
    private String prctSubjCd;
    private String prctSubjNm;
    @Id
    private String diagYmd;
    @Id
    private String diagCd;
    @Id
    private String diagNm;
    @Id
    private String diagStcd;
    @Id
    private String diagStcdNm;
    @Id
    private String diagccDiv;
    @Id
    private String roDiv;
    @Id
    private String prctDvcd;
    @Id
    private String prctDvcdNm;
    @Id
    private String mediBgngYmd;
    @Id
    private String mediEndYmd;
    @Id
    private String diagDrln;
    @Id
    private String diagDrId;
    private String diagDrNm;
    @Id
    private String diagPrctSubjCd;
    private String diagPrctSubjNm;
    @Id
    private Timestamp lastChgDt;
}
