package kr.co.iteyes.agenthelper.entity.id;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * NOT NULL 로 정의된 모든 필드만 포함 = Patient entity 에서 @Id 지정된 필드
 */

@EqualsAndHashCode
@NoArgsConstructor
public class PatientId implements Serializable {
    private String cisn;
    private String ciNo;
    private String patId;
    private String patFlnm;
    private String telno;
    private String emlAddr;
    private String sexCd;
    private String sex;
    private String brdt;
    private String zip;
    private String addr;
    private Timestamp lastChgDt;
}