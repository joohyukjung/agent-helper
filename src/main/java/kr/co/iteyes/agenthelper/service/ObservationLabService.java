package kr.co.iteyes.agenthelper.service;

import kr.co.iteyes.agenthelper.dto.ReqParam;
import kr.co.iteyes.agenthelper.repository.ObservationLabRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service("observation_lab")
@RequiredArgsConstructor
public class ObservationLabService implements ResourceService {

    private final ObservationLabRepository observationLabRepository;

    @Override
    public List getResource(ReqParam reqParam) {
        return observationLabRepository.findAllResource(reqParam.getId(),
                Long.parseLong(reqParam.getRcptNo()));
    }
}
