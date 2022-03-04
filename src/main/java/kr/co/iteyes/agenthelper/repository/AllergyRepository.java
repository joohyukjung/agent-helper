package kr.co.iteyes.agenthelper.repository;

import kr.co.iteyes.agenthelper.entity.Allergy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface AllergyRepository extends JpaRepository<Allergy, Long> {
    @Query("select a from Allergy a where a.patId = :patientId and a.mediBgngYmd between :startDate and :endDate")
    List<Allergy> findAllResource(String patientId, Date startDate, Date endDate);
}
