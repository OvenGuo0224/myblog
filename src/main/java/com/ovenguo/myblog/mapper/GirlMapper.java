package com.ovenguo.myblog.mapper;
/**
 * Demo girl
 * @author 郭天野
 * @date
 */

import com.ovenguo.myblog.config.mybatis.MyMapper;
import com.ovenguo.myblog.model.Girl;

import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface GirlMapper extends MyMapper<Girl> {

    /**
     * 查询单个girl
     * @param girlId
     * @return
     */
    /*@Results(id = "GirlResult", value = {
            @Result(property = "girlId", column = "test_id", id = true),
            @Result(property = "name", column = "test_name", id = true),
            @Result(property = "age", column = "test_age", id = true),
            @Result(property = "cup", column = "test_cup", id = true)
    })
    @Select("SELECT test_id, test_name, test_age, test_cup FROM test WHERE test_id = #{id}")*/
    Girl queryById(int girlId);

    /**
     * 查询所有GIRl
     * @param offet
     * @param limit
     * @return
     */
    List<Girl> queryAll(@Param("offet") int offet, @Param("limit") int limit);

    int insertGirl(@Param("name") String name, @Param("age") int age, @Param("cup") String cup);
}
