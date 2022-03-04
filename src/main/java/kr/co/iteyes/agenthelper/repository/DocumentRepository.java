package kr.co.iteyes.agenthelper.repository;

import kr.co.iteyes.agenthelper.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DocumentRepository extends JpaRepository<Document, Long> {
    @Query("select d from Document d where d.patId = :patientId")
    List<Document> findAllResource(String patientId);
}
