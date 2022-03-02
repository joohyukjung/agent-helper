package kr.co.iteyes.agenthelper.service;

import kr.co.iteyes.agenthelper.dto.ReqParam;
import kr.co.iteyes.agenthelper.repository.DiagnosticRadioRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DiagnosticRadioService implements ResourceService {

    private final DiagnosticRadioRepository diagnosticRadioRepository;

    @Override
    public List getResource(ReqParam reqParam) {
        Date to = new Date();
        Date from = new Date();
        try {
            to = DateUtils.parseDate(reqParam.getStartDate(), "yyyyMMdd");
            from = DateUtils.parseDate(reqParam.getEndDate(), "yyyyMMdd");
        } catch (ParseException e) {
            // TODO badRequestException 발생
            throw new RuntimeException(e.getMessage());
        }
        return diagnosticRadioRepository.findAllResource(reqParam.getId(), to, from);
    }
}
