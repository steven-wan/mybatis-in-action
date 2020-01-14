package com.github.hcsp.mybatis.mapper;

import com.github.hcsp.mybatis.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

/**
 * @author steven
 * @version 1.0
 * @desc
 * @date 2020-01-14 15:28
 */
public interface UserMapper {
    @Select("SELECT * FROM USER WHERE ID = #{id}")
    User selectUserById(int id);

    @Delete("DELETE FROM USER WHERE ID = #{id}")
    void deleteUserById(Integer id);
}
