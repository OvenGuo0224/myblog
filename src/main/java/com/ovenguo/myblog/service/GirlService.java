package com.ovenguo.myblog.service;
/**
 * @author: 郭天野
 */

import com.ovenguo.myblog.model.Girl;

import java.util.List;

public interface GirlService {

    /**
     * 返回列表
     * @return List<Girl>
     */
    List<Girl> getGirlList();

    /**
     * 查询单个Girl
     * @param id
     * @return Girl
     */
    Girl getById(int id);
}
