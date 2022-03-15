package kr.co.iteyes.agenthelper.service;

import kr.co.iteyes.agenthelper.dto.ReqParam;
import kr.co.iteyes.agenthelper.repository.EncounterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("encounter")
@RequiredArgsConstructor
public class EncounterService implements ResourceService {

    private final EncounterRepository encounterRepository;

    @Override
    public List getResource(ReqParam reqParam) {
        return encounterRepository.findAllResource(reqParam.getId(), reqParam.getStartDate(), reqParam.getEndDate());
    }
}
