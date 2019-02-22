package com.baizhi.dao;

import com.baizhi.entity.Emp;

import java.util.List;

public interface EmpDao {

    List<Emp> getAll();

    int deleteByPrimaryKey(Integer id);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);
}
