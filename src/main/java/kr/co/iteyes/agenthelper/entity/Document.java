package kr.co.iteyes.agenthelper.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "TFN_PRCTDOC")
@Getter
public class Document {
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cisn;
    private String rrno;
    private String patId;
    private String docTypCd;
    private String docTypNm;
    private String docSts;
    private String docFrmCd;
    private String docFrmNm;
    private String atcf;
    private Timestamp lastChgDt;
}
