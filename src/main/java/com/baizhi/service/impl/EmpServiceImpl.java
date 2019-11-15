package com.baizhi.service.impl;

import com.baizhi.dao.EmpDao;
import com.baizhi.entity.Emp;
import com.baizhi.service.EmpService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpDao dao;
    @Override
    public List<Emp> getAll(Integer pageNum,Integer pageRows) {
        Page<Object> page = PageHelper.startPage(pageNum, pageRows);
        List<Emp> all = dao.getAll();
        return all;
    }
}
