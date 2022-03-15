package kr.co.iteyes.agenthelper.service;

import kr.co.iteyes.agenthelper.dto.ReqParam;
import kr.co.iteyes.agenthelper.repository.DiagnosticPathoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("diagnostic_patho")
@RequiredArgsConstructor
public class DiagnosticPathoService implements ResourceService{

    private final DiagnosticPathoRepository diagnosticPathoRepository;

    @Override
    public List getResource(ReqParam reqParam) {
        return diagnosticPathoRepository.findAllResource(reqParam.getId(),
                reqParam.getStartDate(),
                reqParam.getEndDate());
    }
}
