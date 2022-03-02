package kr.co.iteyes.agenthelper.service;

import kr.co.iteyes.agenthelper.dto.ReqParam;
import kr.co.iteyes.agenthelper.repository.DocumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("document")
@RequiredArgsConstructor
public class DocumentService implements ResourceService {

    private final DocumentRepository documentRepository;

    @Override
    public List getResource(ReqParam reqParam) {
        return documentRepository.findAllResource(reqParam.getId());
    }
}
