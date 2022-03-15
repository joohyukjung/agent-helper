package kr.co.iteyes.agenthelper.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgreementUpdateDto {
    private String fhirPatIndexId;
    private String fhirOrgIndexId;
}
