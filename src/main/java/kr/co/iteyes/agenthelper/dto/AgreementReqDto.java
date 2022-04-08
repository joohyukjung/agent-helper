package kr.co.iteyes.agenthelper.dto;

import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
@Builder
public class AgreementReqDto {
    @NotNull
    private String cisn;
    @NotNull
    private String rrno; // 최초 동의등록 일 때, 복호화된 주민번호 (이후 pat_id 등록되고 삭제 됨)
    @NotNull
    private String utilUserId;
    @NotNull
    private Long pvsnInstCd;
}
