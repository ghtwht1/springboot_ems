package com.baizhi;

import com.baizhi.dao.EmpDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootEmsApplicationTests {
    @Autowired
    private EmpDao empDao;
    @Test
    public void contextLoads() {
        System.out.println(empDao.getAll());
    }

}
