package kr.co.iteyes.agenthelper.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import kr.co.iteyes.agenthelper.entity.Agreement;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.sql.Timestamp;

@Getter
@Data
@Builder
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class AgreementDto {
    private String cisn;
    private String rrno;
    private String patId;
    private String utilUserId;
    private Long pvsnInstCd;
    private String rcbPrctYmd;
    private String regYmd;
    private String fhirPatIndexId;
    private String fhirOrgIndexId;
    private String useYn;
    private Timestamp lastMdfcnDt;

    public static AgreementDto from(Agreement agreement) {
        if (agreement == null) return null;

        return AgreementDto.builder()
                .cisn(agreement.getCisn())
                .rrno(agreement.getRrno())
                .patId(agreement.getPatId())
                .utilUserId(agreement.getUtilUserId())
                .pvsnInstCd(agreement.getPvsnInstCd())
                .rcbPrctYmd(agreement.getRcbPrctYmd())
                .regYmd(agreement.getRegYmd())
                .fhirPatIndexId(agreement.getFhirPatIndexId())
                .fhirOrgIndexId(agreement.getFhirOrgIndexId())
                .useYn(agreement.getUseYn())
                .lastMdfcnDt(agreement.getLastChgDt())
                .build();
    }
}
