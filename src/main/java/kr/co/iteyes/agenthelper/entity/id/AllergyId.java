package kr.co.iteyes.agenthelper.entity.id;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;

@EqualsAndHashCode
@NoArgsConstructor
public class AllergyId implements Serializable {
    private BigInteger seqNo;
    private String patId;
}
