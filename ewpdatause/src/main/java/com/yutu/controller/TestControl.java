package com.yutu.controller;

import com.yutu.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class TestControl {
    @Resource
    private TestService testService;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("queryDataById")
    public String queryDataById(String id, ModelMap mp){
        mp.addAttribute("cityData",testService.queryDataById(id));
        return "test/city";
    }

    @RequestMapping("queryDataBySF")
    public String queryDataBySF(String sf, ModelMap mp){
        mp.addAttribute("sfDatas",testService.queryDataBySF(sf));
        return "test/sf";
    }
}
