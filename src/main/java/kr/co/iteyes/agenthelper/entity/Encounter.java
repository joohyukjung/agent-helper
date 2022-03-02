package kr.co.iteyes.agenthelper.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
//@Table(name = "TFN_VHOSP")
@Table(name = "TFN_DIAG")
@Getter
public class Encounter {
    @Id
    private String patId;
}
