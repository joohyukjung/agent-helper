package kr.co.iteyes.agenthelper.entity;

import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "TFN_AGRPAT")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Agreement {
    private String cisn;
    private String rrno;
    private String patId;
    @Id
    private String utilUserId;
    private Long pvsnInstCd;
    private Timestamp rcbPrctYmd;
    private Timestamp regYmd;
    private Long fhirPatIndexId;
    private Long fhirOrgIndexId;
    private String useYn;
    @UpdateTimestamp
    private Timestamp lastChgDt;

    public void setFhirPatIndexId(Long fhirPatIndexId) {
        this.fhirPatIndexId = fhirPatIndexId;
    }

    public void setFhirOrgIndexId(Long fhirOrgIndexId) {
        this.fhirOrgIndexId = fhirOrgIndexId;
    }
}
