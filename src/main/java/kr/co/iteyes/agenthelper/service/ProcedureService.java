package kr.co.iteyes.agenthelper.service;

import kr.co.iteyes.agenthelper.dto.ReqParam;
import kr.co.iteyes.agenthelper.repository.ProcedureRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("procedure")
@RequiredArgsConstructor
public class ProcedureService implements ResourceService {

    private final ProcedureRepository procedureRepository;

    @Override
    public List getResource(ReqParam reqParam) {
        return procedureRepository.findAllResource(reqParam.getId(),
                reqParam.getStartDate(),
                reqParam.getEndDate());
    }
}
