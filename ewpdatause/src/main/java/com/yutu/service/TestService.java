package com.yutu.service;

import java.util.List;
import java.util.Map;

public interface TestService {
    Map<String,Object> queryDataById(String id);

    List<Map<String, Object>> queryDataBySF(String sf);
}
