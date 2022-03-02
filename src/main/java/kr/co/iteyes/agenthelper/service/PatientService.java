package kr.co.iteyes.agenthelper.service;

import kr.co.iteyes.agenthelper.dto.ReqParam;
import kr.co.iteyes.agenthelper.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("patient")
@RequiredArgsConstructor
public class PatientService implements ResourceService {

    private final PatientRepository patientRepository;

    @Override
    public List getResource(ReqParam reqParam) {
        return patientRepository.findAllResource(reqParam.getId());
    }
}
