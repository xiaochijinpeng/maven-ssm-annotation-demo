package com.cutiechi.demo.dao;

import com.cutiechi.demo.ApplicationTests;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 用户数据访问接口测试类
 *
 * @author Cutie Chi
 * {@link UserDao 用户数据访问接口}
 */
class UserDaoTests extends ApplicationTests {

    @Autowired
    private UserDao userDao;

    /**
     * 测试获取全部用户列表
     */
    @Test
    void testListAll () {
        userDao.listAll().forEach(System.out::println);
    }
}
