package kr.co.iteyes.agenthelper.service;

import kr.co.iteyes.agenthelper.dto.ReqParam;
import kr.co.iteyes.agenthelper.repository.ImagingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service("imaging")
@RequiredArgsConstructor
public class ImagingService implements ResourceService {

    private final ImagingRepository imagingRepository;

    @Override
    public List getResource(ReqParam reqParam) {
        return imagingRepository.findAllResource(reqParam.getId(),
                new BigInteger(reqParam.getRcptNo()));
    }
}
