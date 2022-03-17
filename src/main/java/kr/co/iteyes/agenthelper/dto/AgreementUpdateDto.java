package kr.co.iteyes.agenthelper.dto;

import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
@Builder
public class AgreementUpdateDto {
    @NotNull
    private String rcbPrctYmd;
    private String fhirPatIndexId;
    private String fhirOrgIndexId;
}
