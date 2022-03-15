package kr.co.iteyes.agenthelper.repository;

import kr.co.iteyes.agenthelper.entity.ObservationLab;
import kr.co.iteyes.agenthelper.entity.id.ObservationLabId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ObservationLabRepository extends JpaRepository<ObservationLab, ObservationLabId> {
    @Query("select o from ObservationLab o, Encounter e where 1=1 and o.rcptNo = e.rcptNo and e.patId = :patientId and e.mediBgngYmd between :startDate and :endDate")
    List<ObservationLab> findAllResource(String patientId, String startDate, String endDate);
}
