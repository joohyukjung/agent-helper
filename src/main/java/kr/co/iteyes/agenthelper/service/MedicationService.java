package kr.co.iteyes.agenthelper.service;

import kr.co.iteyes.agenthelper.dto.ReqParam;
import kr.co.iteyes.agenthelper.repository.MedicationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service("medication")
@RequiredArgsConstructor
public class MedicationService implements ResourceService {
    private final MedicationRepository medicationRepository;

    @Override
    public List getResource(ReqParam reqParam) {
        return medicationRepository.findAllResource(reqParam.getId(),
                Date.valueOf(reqParam.getStartDate()),
                Date.valueOf(reqParam.getEndDate()));
    }
}
