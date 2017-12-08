package com.ovenguo.myblog.mapper;

import com.ovenguo.myblog.MyblogApplication;
import com.ovenguo.myblog.model.Girl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 郭天野
 * @version V1.0
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date ${date} ${time}
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@Transactional
@SpringBootTest(classes = MyblogApplication.class)
public class GirlMapperTest {

    @Autowired
    private GirlMapper girlMapper;

    @Test
    public void queryById() {
        System.out.println(girlMapper.queryById(1));
    }

    @Test
    public void queryAll() {
        System.out.println(girlMapper.queryAll(0,5));
    }
}