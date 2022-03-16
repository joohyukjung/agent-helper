package kr.co.iteyes.agenthelper.service;

import kr.co.iteyes.agenthelper.dto.AgreementDto;
import kr.co.iteyes.agenthelper.dto.AgreementReqDto;
import kr.co.iteyes.agenthelper.dto.AgreementUpdateDto;
import kr.co.iteyes.agenthelper.entity.Agreement;
import kr.co.iteyes.agenthelper.exception.ResourceNotValidException;
import kr.co.iteyes.agenthelper.repository.AgreementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;


@Service("agreement")
@RequiredArgsConstructor
public class AgreementService {

    private final AgreementRepository agreementRepository;

    public AgreementDto createAgreement(AgreementReqDto agreementReqDto) {
        Agreement agreement = Agreement.builder()
                .cisn(agreementReqDto.getCisn())
                .ciNo(agreementReqDto.getCiNo())
                .patId("1233")
                .regYmd(agreementReqDto.getRegYmd())
                .lastMdfcnDt(new Timestamp(System.currentTimeMillis()))
                .build();

        return AgreementDto.from(agreementRepository.save(agreement));
    }

    public void deleteAgreement(String patientId) {
        agreementRepository.deleteById(patientId);
    }

    public void updateAgreement(String patientId, AgreementUpdateDto agreementUpdateDto) {

        Agreement agreement = agreementRepository.findById(patientId).orElseThrow(ResourceNotValidException::new);

        Agreement test = Agreement.builder()
                .cisn(agreement.getCisn())
                .patId(patientId)
                .utilUserId(agreement.getUtilUserId())
                .pvsnInstCd(agreement.getPvsnInstCd())
                .rcbPrctYmd(agreement.getRcbPrctYmd())
                .regYmd(agreement.getRegYmd())
                .fhirPatIndexId(agreementUpdateDto.getFhirPatIndexId())
                .fhirOrgIndexId(agreementUpdateDto.getFhirOrgIndexId())
                .lastMdfcnDt(agreement.getLastMdfcnDt())
                .build();

        agreementRepository.save(test);
    }

    public Agreement getAgreement(String patientId) {
        return agreementRepository.findById(patientId).orElseThrow(ResourceNotValidException::new);
    }
}
