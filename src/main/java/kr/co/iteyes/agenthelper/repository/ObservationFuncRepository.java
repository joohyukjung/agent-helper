package kr.co.iteyes.agenthelper.repository;

import kr.co.iteyes.agenthelper.entity.ObservationFunc;
import kr.co.iteyes.agenthelper.entity.id.ObservationFuncId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface ObservationFuncRepository extends JpaRepository<ObservationFunc, ObservationFuncId> {
    @Query("select o from ObservationFunc o where o.patId = :patientId and o.inspDt between :startDate and :endDate")
    List<ObservationFunc> findAllResource(String patientId, Date startDate, Date endDate);
}
