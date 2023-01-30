package kr.co.iteyes.agenthelper.entity.id;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * NOT NULL 로 정의된 모든 필드만 포함 = Patient entity 에서 @Id 지정된 필드
 */
@EqualsAndHashCode
@NoArgsConstructor
public class OrganizationId implements Serializable {
    private String cisn;
    private Timestamp lastChgDt;
}