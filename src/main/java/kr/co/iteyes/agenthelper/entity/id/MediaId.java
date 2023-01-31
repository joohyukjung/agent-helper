package kr.co.iteyes.agenthelper.entity.id;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@EqualsAndHashCode
@NoArgsConstructor
public class MediaId implements Serializable {
    private Long seqNo;
    private String patId;
}
