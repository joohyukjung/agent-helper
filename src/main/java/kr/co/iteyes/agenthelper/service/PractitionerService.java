package kr.co.iteyes.agenthelper.service;

import kr.co.iteyes.agenthelper.dto.ReqParam;
import kr.co.iteyes.agenthelper.repository.PractitionerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("practitioner")
@RequiredArgsConstructor
public class PractitionerService implements ResourceService {

    private final PractitionerRepository practitionerRepository;

    @Override
    public List getResource(ReqParam reqParam) {
        return practitionerRepository.findAllResource(reqParam.getId());
    }
}
