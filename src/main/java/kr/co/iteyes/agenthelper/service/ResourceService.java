package kr.co.iteyes.agenthelper.service;

import kr.co.iteyes.agenthelper.dto.ReqParam;

import java.util.List;

public interface ResourceService<T> {

    List<T> getResource(ReqParam reqParam);

}
