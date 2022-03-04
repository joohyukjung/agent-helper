package kr.co.iteyes.agenthelper.repository;

import kr.co.iteyes.agenthelper.entity.ObservationFunc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface ObservationFuncRepository extends JpaRepository<ObservationFunc, Long> {
    @Query("select o from ObservationFunc o where o.patNo = :patientId and o.inspDtm between :startDate and :endDate")
    List<ObservationFunc> findAllResource(String patientId, Date startDate, Date endDate);
}
