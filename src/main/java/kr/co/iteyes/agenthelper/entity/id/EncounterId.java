package kr.co.iteyes.agenthelper.entity.id;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;

@EqualsAndHashCode
@NoArgsConstructor
public class EncounterId implements Serializable {
    private BigInteger rcptNo;
    private Timestamp lastChgDt;
}
