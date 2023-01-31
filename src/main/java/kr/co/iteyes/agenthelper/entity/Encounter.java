package kr.co.iteyes.agenthelper.entity;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import kr.co.iteyes.agenthelper.entity.id.EncounterId;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "TFN_VHOSP")
@IdClass(EncounterId.class)
@Getter
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Encounter {
    @Id
    private Long rcptNo;
    private String rcptStsCd;
    private String patId;
    private String drId;
    private String prctDvcd;
    private Timestamp mediBgngYmd;
    private Timestamp mediEndYmd;
    @Id
    private Timestamp lastChgDt;
}
