package com.cutiechi.demo.dao;

import com.cutiechi.demo.model.entity.User;

import org.apache.ibatis.annotations.Select;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户数据访问对象接口
 *
 * @author Cutie Chi
 */
@Repository
public interface UserDao {

    /**
     * 获取全部用户列表
     *
     * @return 全部用户列表
     */
    @Select("select user_id, user_name, user_password from user")
    List<User> listAll ();
}
