package kr.co.iteyes.agenthelper.entity.id;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;

@EqualsAndHashCode
@NoArgsConstructor
public class MedicationId implements Serializable {
    private BigInteger seqNo;
    private BigInteger rcptNo;
    private String patId;
    private Timestamp lastChgDt;
}
