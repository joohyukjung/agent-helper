package kr.co.iteyes.agenthelper.entity.id;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * NOT NULL 로 정의된 모든 필드만 포함 = Patient entity 에서 @Id 지정된 필드
 */
@EqualsAndHashCode
@NoArgsConstructor
public class OrganizationId implements Serializable {
    private String cisn;
    private String careInstNm;
    private String hpcfDvcd;
    private String hpcfDvnm;
    private String zip;
    private String addr;
    private String regnAddr;
    private String daddrl;
}