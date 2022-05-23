package kr.co.iteyes.agenthelper.repository;

import kr.co.iteyes.agenthelper.entity.ObservationLab;
import kr.co.iteyes.agenthelper.entity.id.ObservationLabId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ObservationLabRepository extends JpaRepository<ObservationLab, ObservationLabId> {
    @Query("select o from ObservationLab o where o.patId = :patientId and o.rcptNo = :rcptNo")
    List<ObservationLab> findAllResource(String patientId, Long rcptNo);
}
