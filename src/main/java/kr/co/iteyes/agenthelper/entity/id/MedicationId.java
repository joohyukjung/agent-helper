package kr.co.iteyes.agenthelper.entity.id;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

@EqualsAndHashCode
@NoArgsConstructor
public class MedicationId implements Serializable {
    private Long seqNo;
    private Long rcptNo;
    private String patId;
    private Timestamp lastChgDt;
}
