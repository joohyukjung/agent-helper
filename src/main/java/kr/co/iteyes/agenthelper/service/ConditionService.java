package kr.co.iteyes.agenthelper.service;

import kr.co.iteyes.agenthelper.dto.ReqParam;
import kr.co.iteyes.agenthelper.repository.ConditionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service("condition")
@RequiredArgsConstructor
public class ConditionService implements ResourceService{

    private final ConditionRepository conditionRepository;

    @Override
    public List getResource(ReqParam reqParam) {
        return conditionRepository.findAllResource(reqParam.getId(),
                new BigInteger(reqParam.getRcptNo()));
    }
}
