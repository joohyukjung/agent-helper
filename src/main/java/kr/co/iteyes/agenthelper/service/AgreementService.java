package kr.co.iteyes.agenthelper.service;

import kr.co.iteyes.agenthelper.dto.AgreementDto;
import kr.co.iteyes.agenthelper.dto.AgreementUpdateDto;
import kr.co.iteyes.agenthelper.dto.ReqParam;
import kr.co.iteyes.agenthelper.entity.Agreement;
import kr.co.iteyes.agenthelper.exception.ResourceNotValidException;
import kr.co.iteyes.agenthelper.repository.AgreementRepository;
import kr.co.iteyes.agenthelper.repository.AllergyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.Id;

import java.sql.Date;
import java.util.List;


@Service("agreement")
@RequiredArgsConstructor
public class AgreementService {

    private final AgreementRepository agreementRepository;

    public AgreementDto createAgreement(AgreementDto agreementDto) {
        Agreement agreement = Agreement.builder()
                .cisn(agreementDto.getCisn())
                .patId("1233")
                .utilUserId(agreementDto.getUtilUserId())
                .pvsnInstCd(1L)
                .rcbPrctYmd("20220309")
                .regYmd(agreementDto.getRegYmd())
                .fhirPatIndexId("213123123")
                .fhirOrgIndexId("123123123")
                .lastMdfcnDt(agreementDto.getLastMdfcnDt())
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
