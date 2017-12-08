package com.ovenguo.myblog.controller;

import com.ovenguo.myblog.mapper.GirlMapper;
import com.ovenguo.myblog.model.Girl;
import com.ovenguo.myblog.service.GirlService;
import com.ovenguo.myblog.service.impl.GirlServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Girls {

    @Autowired
    private GirlServiceImpl girlService;

    @RequestMapping("/Girls")
    public List<Girl> list(){
        return girlService.getGirlList();
    }

    @RequestMapping(value = "/Girl", method = RequestMethod.GET)
    public Girl getByid(){
        int id = 1;
        Girl girl = girlService.getById(id);
        if (girl == null) {
            girl.setName("any");
            girl.setAge(18);
            girl.setCup("B");
        }
        return girl;
    }

    /*@RequestMapping(value = "/insert", method = RequestMethod.POST)*/
}
