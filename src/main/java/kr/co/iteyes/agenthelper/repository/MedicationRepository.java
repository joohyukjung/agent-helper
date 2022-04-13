package kr.co.iteyes.agenthelper.repository;

import kr.co.iteyes.agenthelper.entity.Medication;
import kr.co.iteyes.agenthelper.entity.id.MedicationId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface MedicationRepository extends JpaRepository<Medication, MedicationId> {
    @Query("select m from Medication m where m.patId = :patientId and m.mediBgngYmd between :startDate and :endDate")
    List<Medication> findAllResource(String patientId, Long startDate, Long endDate);
}
