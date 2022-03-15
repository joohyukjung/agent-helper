package kr.co.iteyes.agenthelper.entity;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import kr.co.iteyes.agenthelper.entity.id.DocumentId;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "TFN_PRCTDOC")
@IdClass(DocumentId.class)
@Getter
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Document {
    @Id
    private String cisn;
    @Id
    private String ciNo;
    @Id
    private String patId;
    @Id
    private String docCrtDt;
    private String docTypCd;
    private String docTypNm;
    @Id
    private String docSts;
    private String docFrmCd;
    private String docFrmNm;
    private String atcf;
    @Id
    private Timestamp lastChgDt;
}
