package com.ovenguo.myblog.service.impl;

/**
 * @author: 郭天野
 */

import com.ovenguo.myblog.mapper.GirlMapper;
import com.ovenguo.myblog.model.Girl;
import com.ovenguo.myblog.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GirlServiceImpl implements GirlService{

    @Autowired
    private GirlMapper girlMapper;

    @Override
    public List<Girl> getGirlList() {
        return girlMapper.queryAll(0,10);
    }

    @Override
    public Girl getById(int id) {
        return girlMapper.queryById(id);
    }
}
