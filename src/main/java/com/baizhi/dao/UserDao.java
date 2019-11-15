package com.baizhi.dao;

import com.baizhi.entity.User;

public interface UserDao {
    void a();
    User select(String username);
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}