package kr.co.iteyes.agenthelper.controller;

import kr.co.iteyes.agenthelper.dto.ReqParam;
import kr.co.iteyes.agenthelper.service.ResourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ResourceController {

    private final ApplicationContext applicationContext;

    @GetMapping("/")
    ResponseEntity<List<?>> getResource(
            @Valid @ModelAttribute ReqParam reqParam) {
        ResourceService sample = applicationContext.getBean(reqParam.getReqType().getResource(), ResourceService.class);
        return ResponseEntity.ok(sample.getResource(reqParam));
    }
}
