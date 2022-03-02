package kr.co.iteyes.agenthelper.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "TFN_PRCTDR")
@Getter
public class Practitioner {
    @Id
    private String cisn;
    private Long  drln;
    private String drId;
    private String subjCd;
    private String drFlnm;
    private String drFtnm;
    private String drLtnm;
    private String subjNm;
    private String mprctSubjYn;
    private Timestamp lastChgDt;
}
