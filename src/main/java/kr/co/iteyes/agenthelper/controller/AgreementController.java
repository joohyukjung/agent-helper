package kr.co.iteyes.agenthelper.controller;

import kr.co.iteyes.agenthelper.dto.AgreementDto;
import kr.co.iteyes.agenthelper.dto.AgreementReqDto;
import kr.co.iteyes.agenthelper.dto.AgreementUpdateDto;
import kr.co.iteyes.agenthelper.service.AgreementService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class AgreementController {

    private final AgreementService agreementService;

    @PostMapping("/agreement")
    ResponseEntity<AgreementDto> createAgreement(
            @Valid @RequestBody AgreementReqDto agreementReqDto) {
        return ResponseEntity.ok(agreementService.createAgreement(agreementReqDto));
    }

    @GetMapping("/agreement/{id}")
    ResponseEntity<AgreementDto> getAgreement(
            @PathVariable("id") String utilUserId) {
        return ResponseEntity.ok(agreementService.getAgreement(utilUserId));
    }

    @GetMapping("/agreement")
    ResponseEntity<List<AgreementDto>> getAgreements() {
        return ResponseEntity.ok(agreementService.getAgreements());
    }

    @DeleteMapping("/agreement/{id}")
    ResponseEntity<?> deleteAgreement(
            @PathVariable("id") String utilUserId) {
        agreementService.deleteAgreement(utilUserId);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/agreement/{id}")
    ResponseEntity<AgreementDto> updateAgreement(
            @PathVariable("id") String utilUserId,
            @Valid @RequestBody AgreementUpdateDto agreementUpdateDto) {
        return ResponseEntity.ok(agreementService.updateAgreement(utilUserId, agreementUpdateDto));
    }
}
