package kr.co.iteyes.agenthelper.entity.id;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@EqualsAndHashCode
@NoArgsConstructor
public class DocumentId implements Serializable {
    private String cisn;
    private String ciNo;
    private String patId;
    private String docTypCd;
    private String docSts;
    private String docFrmNm;
    private String atcf;
    private Timestamp lastChgDt;
}
