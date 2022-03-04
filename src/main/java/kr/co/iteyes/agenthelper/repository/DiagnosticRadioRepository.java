package kr.co.iteyes.agenthelper.repository;

import kr.co.iteyes.agenthelper.entity.DiagnosticRadio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface DiagnosticRadioRepository extends JpaRepository<DiagnosticRadio, Long> {
    @Query("select d from DiagnosticRadio d where d.patNo = :patientId and d.inspDtm between :startDate and :endDate")
    List<DiagnosticRadio> findAllResource(String patientId, Date startDate, Date endDate);
}
