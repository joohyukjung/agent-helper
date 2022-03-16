package kr.co.iteyes.agenthelper.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgreementReqDto {
    @NotNull
    private String cisn;
    @NotNull
    private String ciNo;
    @NotNull
    private String regYmd;
}
