package kr.co.iteyes.agenthelper.repository;

import kr.co.iteyes.agenthelper.entity.Imaging;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface ImagingRepository extends JpaRepository<Imaging, String> {
    @Query("select i from Imaging i where i.patNo = :patientId and i.inspDtm between :startDate and :endDate")
    List<Imaging> findAllResource(String patientId, Date startDate, Date endDate);
}
