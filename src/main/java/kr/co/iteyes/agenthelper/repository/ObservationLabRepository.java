package kr.co.iteyes.agenthelper.repository;

import kr.co.iteyes.agenthelper.entity.ObservationLab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface ObservationLabRepository extends JpaRepository<ObservationLab, Long> {
    @Query("select o from ObservationLab o where o.patNo = :patientId and o.inspDtm between :startDate and :endDate")
    List<ObservationLab> findAllResource(String patientId, Date startDate, Date endDate);
}
