package com.ovenguo.myblog.mapper;

import com.ovenguo.myblog.model.Girl;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * @author 郭天野
 * @version V1.0
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date ${date} ${time}
 */
public interface GirlMapper331 {

    @Results(id = "GirlResult", value = {
            @Result(property = "girlId", column = "test_id", id = true),
            @Result(property = "name", column = "test_name", id = true),
            @Result(property = "age", column = "test_age", id = true),
            @Result(property = "cup", column = "test_cup", id = true)
    })
    @Select("SELECT test_id, test_name, test_age, test_cup FROM test WHERE test_id = #{id}")
    Girl selectByid(int id);
}
