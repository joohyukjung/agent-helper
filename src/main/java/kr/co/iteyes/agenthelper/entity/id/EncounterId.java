package kr.co.iteyes.agenthelper.entity.id;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@EqualsAndHashCode
@NoArgsConstructor
public class EncounterId implements Serializable {
    private String cisn;
    private String ciNo;
    private Long rcptNo;
    private String patId;
    private String drId;
    private String prctDvcd;
    private String prctDvcdNm;
    private String mediBgngYmd;
    private Timestamp lastChgDt;
}
