package kr.co.iteyes.agenthelper.controller;

import kr.co.iteyes.agenthelper.dto.AgreementDto;
import kr.co.iteyes.agenthelper.dto.AgreementUpdateDto;
import kr.co.iteyes.agenthelper.service.AgreementService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class AgreementController {

    private final AgreementService agreementService;

    @PostMapping("/agreement")
    ResponseEntity<AgreementDto> createAgreement(
            @Valid @RequestBody AgreementDto agreementDto) {
        return ResponseEntity.ok(agreementService.createAgreement(agreementDto));
    }

    @DeleteMapping("/agreement/{id}")
    ResponseEntity<?> deleteAgreement(
            @PathVariable("id") String patientId) {
        agreementService.deleteAgreement(patientId);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/agreement/{id}")
    ResponseEntity<?> updateAgreement(
            @PathVariable("id") String patientId,
            @Valid @RequestBody AgreementUpdateDto agreementUpdateDto) {
        agreementService.updateAgreement(patientId, agreementUpdateDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/agreement/{id}")
    ResponseEntity<?> getAgreement(
            @PathVariable("id") String patientId) {
        return ResponseEntity.ok(agreementService.getAgreement(patientId));
    }
}
