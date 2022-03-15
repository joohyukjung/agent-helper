package kr.co.iteyes.agenthelper.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ReqType{
    P01("patient"),
    O01("organization"),
    P02("practitioner"),
    E01("encounter"),
    C01("condition"),
    M01("medication"),
    A01("allergy"),
    D01("document"),
    D02("diagnostic_radio"),
    D03("diagnostic_patho"),
    O02("observation_lab"),
    O03("observation_func"),
    P03("procedure"),
    I01("imaging"),
    M02("media");

    private String resource;
}
