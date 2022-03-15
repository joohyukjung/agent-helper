package kr.co.iteyes.agenthelper.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import kr.co.iteyes.agenthelper.entity.Agreement;
import lombok.Builder;
import lombok.Getter;

import java.sql.Timestamp;

@Getter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgreementDto {
    private String cisn;
    private String utilUserId;
    private String rcbPrctYmd;
    private String regYmd;
    private String fhirPatIndexId;
    private String fhirOrgIndexId;
    private Timestamp lastMdfcnDt;

    public static AgreementDto from(Agreement agreement) {
        if (agreement == null) return null;

        return AgreementDto.builder()
                .cisn(agreement.getCisn())
                .utilUserId(agreement.getUtilUserId())
                .rcbPrctYmd(agreement.getRcbPrctYmd())
                .regYmd(agreement.getRegYmd())
                .fhirPatIndexId(agreement.getFhirPatIndexId())
                .fhirOrgIndexId(agreement.getFhirOrgIndexId())
                .lastMdfcnDt(agreement.getLastMdfcnDt())
                .build();
    }
}
