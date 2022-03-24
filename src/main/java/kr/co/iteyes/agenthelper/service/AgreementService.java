package kr.co.iteyes.agenthelper.service;

import kr.co.iteyes.agenthelper.dto.AgreementDto;
import kr.co.iteyes.agenthelper.dto.AgreementReqDto;
import kr.co.iteyes.agenthelper.dto.AgreementUpdateDto;
import kr.co.iteyes.agenthelper.entity.Agreement;
import kr.co.iteyes.agenthelper.exception.ResourceNotFoundException;
import kr.co.iteyes.agenthelper.exception.ResourceNotValidException;
import kr.co.iteyes.agenthelper.repository.AgreementRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


@Service("agreement")
@RequiredArgsConstructor
public class AgreementService {

    private final AgreementRepository agreementRepository;

    public AgreementDto createAgreement(AgreementReqDto agreementReqDto) {
        Agreement agreement = Agreement.builder()
                .cisn(agreementReqDto.getCisn())
                .ciNo(agreementReqDto.getCiNo())    // 주민번호
                .utilUserId(agreementReqDto.getUtilUserId())
                .pvsnInstCd(agreementReqDto.getPvsnInstCd())
                .regYmd(new SimpleDateFormat("yyyyMMdd").format(new Date()))
                .build();

        return AgreementDto.from(agreementRepository.save(agreement));
    }

    public void deleteAgreement(String utilUserId) {
        agreementRepository.deleteById(utilUserId);
    }

    public AgreementDto updateAgreement(String utilUserId, AgreementUpdateDto agreementUpdateDto) {

        Agreement agreement = agreementRepository.findById(utilUserId).orElseThrow(ResourceNotValidException::new);

        String fhirPatIndexid = agreement.getFhirPatIndexId();
        String fhirOrgIndexId = agreement.getFhirOrgIndexId();

        if(StringUtils.isNotBlank(agreementUpdateDto.getFhirPatIndexId())
            && StringUtils.isNotBlank(agreementUpdateDto.getFhirOrgIndexId())) {
            fhirPatIndexid = agreementUpdateDto.getFhirPatIndexId();
            fhirOrgIndexId = agreementUpdateDto.getFhirOrgIndexId();

            agreement.setFhirPatIndexId(fhirPatIndexid);
            agreement.setFhirOrgIndexId(fhirOrgIndexId);
        }

        Agreement updatedAgreement = Agreement.builder()
                .cisn(agreement.getCisn())
                .ciNo(agreement.getCiNo())
                .patId(agreement.getPatId())
                .utilUserId(utilUserId)
                .pvsnInstCd(agreement.getPvsnInstCd())
                .rcbPrctYmd(agreementUpdateDto.getRcbPrctYmd())
                .regYmd(agreement.getRegYmd())
                .fhirPatIndexId(fhirPatIndexid)
                .fhirOrgIndexId(fhirOrgIndexId)
                .build();

        return AgreementDto.from(agreementRepository.save(updatedAgreement));
    }

    public AgreementDto getAgreement(String utilUserId) {
        return AgreementDto.from(agreementRepository.findById(utilUserId).orElseThrow(ResourceNotFoundException::new));
    }

    public List<AgreementDto> getAgreements() {
        return agreementRepository.findAll().stream().map(r -> AgreementDto.from(r)).collect(Collectors.toList());
    }
}
