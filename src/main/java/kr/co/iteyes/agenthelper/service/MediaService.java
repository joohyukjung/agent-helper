package kr.co.iteyes.agenthelper.service;

import kr.co.iteyes.agenthelper.dto.ReqParam;
import kr.co.iteyes.agenthelper.repository.MediaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("media")
@RequiredArgsConstructor
public class MediaService implements ResourceService{

    private final MediaRepository mediaRepository;

    @Override
    public List getResource(ReqParam reqParam) {
        return mediaRepository.findAllResource(reqParam.getId(), reqParam.getStartDate(), reqParam.getEndDate());
    }
}
