package kr.co.iteyes.agenthelper.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
@Table(name = "TFN_AGRPAT")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Agreement {
    @NotNull
    private String cisn;
    @NotNull
    private String ciNo;
    @NotNull
    @Id
    private String patId;
    private String utilUserId;
    private Long pvsnInstCd;
    private String rcbPrctYmd;
    @NotNull
    private String regYmd;
    private String fhirPatIndexId;
    private String fhirOrgIndexId;
    @NotNull
    private Timestamp lastMdfcnDt;

    public void setFhirPatIndexId(String fhirPatIndexId) {
        this.fhirPatIndexId = fhirPatIndexId;
    }

    public void setFhirOrgIndexId(String fhirOrgIndexId) {
        this.fhirOrgIndexId = fhirOrgIndexId;
    }
}
