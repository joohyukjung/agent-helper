package kr.co.iteyes.agenthelper.repository;

import kr.co.iteyes.agenthelper.entity.Document;
import kr.co.iteyes.agenthelper.entity.id.DocumentId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DocumentRepository extends JpaRepository<Document, DocumentId> {
    @Query("select d from Document d where d.patId = :patientId")
    List<Document> findAllResource(String patientId);
}
