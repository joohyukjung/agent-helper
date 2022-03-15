package kr.co.iteyes.agenthelper.entity;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import kr.co.iteyes.agenthelper.entity.id.PractitionerId;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "TFN_PRCTDR")
@IdClass(PractitionerId.class)
@Getter
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Practitioner {
    @Id
    private String cisn;
    @Id
    private String drln;
    @Id
    private String drId;
    @Id
    private String subjCd;
    @Id
    private String drFlnm;
    private String drFtnm;
    private String drLtnm;
    private String subjNm;
    @Id
    private String mprctSubjYn;
    @Id
    private Timestamp lastChgDt;
}
