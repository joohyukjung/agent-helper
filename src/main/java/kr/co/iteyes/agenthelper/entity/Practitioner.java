package kr.co.iteyes.agenthelper.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "TFN_PRCTDR")
@Getter
public class Practitioner {
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
