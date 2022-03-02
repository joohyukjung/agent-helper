package kr.co.iteyes.agenthelper.service;

import kr.co.iteyes.agenthelper.dto.ReqParam;
import kr.co.iteyes.agenthelper.repository.OrganizationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("organization")
@RequiredArgsConstructor
public class OrganizationService implements ResourceService {

    private final OrganizationRepository organizationRepository;

    @Override
    public List getResource(ReqParam reqParam) {
        return organizationRepository.findAllResource();
    }
}
