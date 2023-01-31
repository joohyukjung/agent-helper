package kr.co.iteyes.agenthelper.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import kr.co.iteyes.agenthelper.entity.Agreement;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

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
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        String tempFhirPatIndexId = null;
        String tempFhirOrgIndexId = null;
        String tempRcbPrctYmd = null;
        if(agreement.getFhirPatIndexId() != null) tempFhirPatIndexId = agreement.getFhirPatIndexId().toString();
        if(agreement.getFhirOrgIndexId() != null) tempFhirOrgIndexId = agreement.getFhirOrgIndexId().toString();
        if(agreement.getRcbPrctYmd() != null) simpleDateFormat.format(agreement.getRcbPrctYmd());
        return AgreementDto.builder()
                .cisn(agreement.getCisn())
                .rrno(agreement.getRrno())
                .patId(agreement.getPatId())
                .utilUserId(agreement.getUtilUserId())
                .pvsnInstCd(agreement.getPvsnInstCd())
                .rcbPrctYmd(tempRcbPrctYmd)
                .regYmd(simpleDateFormat.format(agreement.getRegYmd()))
                .fhirPatIndexId(tempFhirPatIndexId)
                .fhirOrgIndexId(tempFhirOrgIndexId)
                .useYn(agreement.getUseYn())
                .lastMdfcnDt(agreement.getLastChgDt())
                .build();
    }
}
