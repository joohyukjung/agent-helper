package kr.co.iteyes.agenthelper.entity.id;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@EqualsAndHashCode
@NoArgsConstructor
public class ConditionId implements Serializable {
    private String cisn;
    private String ciNo;
    private Long rcptNo;
    private String patId;
    private String drId;
    private String prctSubjCd;
    private String diagYmd;
    private String diagCd;
    private String diagNm;
    private String diagStcd;
    private String diagStcdNm;
    private String diagccDiv;
    private String roDiv;
    private String prctDvcd;
    private String prctDvcdNm;
    private String mediBgngYmd;
    private String mediEndYmd;
    private String diagDrId;
    private String diagPrctSubjCd;
    private Timestamp lastChgDt;
}