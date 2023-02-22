package kr.co.iteyes.agenthelper.service;

import kr.co.iteyes.agenthelper.dto.ReqParam;
import kr.co.iteyes.agenthelper.repository.AllergyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;


@Service("allergy")
@RequiredArgsConstructor
public class AllergyService implements ResourceService {

    private final AllergyRepository allergyRepository;

    @Override
    public List getResource(ReqParam reqParam) {
        return allergyRepository.findAllResource(reqParam.getId(),
                new BigInteger(reqParam.getRcptNo()));
    }
}
