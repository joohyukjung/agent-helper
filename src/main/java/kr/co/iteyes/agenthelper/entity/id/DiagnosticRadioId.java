package kr.co.iteyes.agenthelper.entity.id;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigInteger;

@EqualsAndHashCode
@NoArgsConstructor
public class DiagnosticRadioId implements Serializable {
    private BigInteger seqNo;
    private String patId;
}
