package kr.co.iteyes.agenthelper.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "TFN_PRCTDOC")
@Getter
public class Document {
    private String cisn;
    private String rrno;
    @Id
    private String patId;
    private String docTypCd;
    private String docTypNm;
    private String docSts;
    private String docFrmCd;
    private String docFrmNm;
    private String atcf;
    private Timestamp lastChgDt;
}
