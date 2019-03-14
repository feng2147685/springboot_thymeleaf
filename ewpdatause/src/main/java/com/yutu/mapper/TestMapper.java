package com.yutu.mapper;

import java.util.List;
import java.util.Map;

public interface TestMapper {
    Map<String, Object> queryDataById(String id);
    List<Map<String, Object>> queryDataBySF(String sf);
}
