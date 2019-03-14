package com.yutu.service.impl;

import com.yutu.mapper.TestMapper;
import com.yutu.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;

    @Override
    public Map<String,Object> queryDataById(String id) {
        return testMapper.queryDataById(id);
    }

    @Override
    public List<Map<String, Object>> queryDataBySF(String sf) {
        return testMapper.queryDataBySF(sf);
    }
}
