package kr.co.iteyes.agenthelper.entity.id;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@EqualsAndHashCode
@NoArgsConstructor
public class PractitionerId implements Serializable {
    private String cisn;
    private String drln;
    private String drId;
    private String subjCd;
    private String drFlnm;
    private String mprctSubjYn;
    private Timestamp lastChgDt;
}
