package kr.co.iteyes.agenthelper.service;

import kr.co.iteyes.agenthelper.dto.ReqParam;
import kr.co.iteyes.agenthelper.repository.DiagnosticRadioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service("diagnostic_radio")
@RequiredArgsConstructor
public class DiagnosticRadioService implements ResourceService {

    private final DiagnosticRadioRepository diagnosticRadioRepository;

    @Override
    public List getResource(ReqParam reqParam) {
        return diagnosticRadioRepository.findAllResource(reqParam.getId(),
                Date.valueOf(reqParam.getStartDate()),
                Date.valueOf(reqParam.getEndDate()));
    }
}