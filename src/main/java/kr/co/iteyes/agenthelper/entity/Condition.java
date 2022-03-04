package kr.co.iteyes.agenthelper.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "TFN_DIAG")
@Getter
public class Condition {
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cisn;
    private String rrno;
    private Long rcptNo;
    private String patId;
    private Long drln;
    private String drId;
    private String drNm;
    private String prctSubjCd;
    private String prctSubjNm;
    private Date diagYmd;
    private String diagCd;
    private String diagNm;
    private String diagStcd;
    private String diagStcdNm;
    private String diagccDiv;
    private String roDiv;
    private String prctDvcd;
    private String prctDvcdNm;
    private Date mediBgngYmd;
    private Date mediEndYmd;
    private Long diagDrln;
    private String diagDrId;
    private String diagDrNm;
    private String diagPrctSubjCd;
    private String diagPrctSubjNm;
    private Timestamp lastChgDt;
}
