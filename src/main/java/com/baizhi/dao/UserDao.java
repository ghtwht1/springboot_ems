package com.baizhi.dao;

import com.baizhi.entity.User;

public interface UserDao {
    User sele1ct1(String username);
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}