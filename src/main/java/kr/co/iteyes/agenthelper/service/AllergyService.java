package kr.co.iteyes.agenthelper.service;

import kr.co.iteyes.agenthelper.dto.ReqParam;
import kr.co.iteyes.agenthelper.repository.AllergyRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Service("allergy")
@RequiredArgsConstructor
public class AllergyService implements ResourceService {

    private final AllergyRepository allergyRepository;

    @Override
    public List getResource(ReqParam reqParam) {
        Date to = new Date();
        Date from = new Date();
        try {
            to = DateUtils.parseDate(reqParam.getStartDate(), "yyyyMMdd");
            from = DateUtils.parseDate(reqParam.getEndDate(), "yyyyMMdd");
        } catch (ParseException e) {
            // TODO badRequestException 발생
            throw new RuntimeException(e.getMessage());
        }
        return allergyRepository.findAllResource(reqParam.getId(), to, from);
    }
}
