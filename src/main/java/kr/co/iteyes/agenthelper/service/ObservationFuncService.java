package kr.co.iteyes.agenthelper.service;

import kr.co.iteyes.agenthelper.dto.ReqParam;
import kr.co.iteyes.agenthelper.repository.ObservationFuncRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service("observation_func")
@RequiredArgsConstructor
public class ObservationFuncService implements ResourceService {

    private final ObservationFuncRepository observationFuncRepository;

    @Override
    public List getResource(ReqParam reqParam) {
        return observationFuncRepository.findAllResource(reqParam.getId(),
                Long.parseLong(reqParam.getRcptNo()));
    }
}
