package kr.co.iteyes.agenthelper.repository;

import kr.co.iteyes.agenthelper.entity.DiagnosticPatho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface DiagnosticPathoRepository extends JpaRepository<DiagnosticPatho, Long> {
    @Query("select d from DiagnosticPatho d where d.patNo = :patientId and d.inspDtm between :startDate and :endDate")
    List<DiagnosticPatho> findAllResource(String patientId, Date startDate, Date endDate);
}
