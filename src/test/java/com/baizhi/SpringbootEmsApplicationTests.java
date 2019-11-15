package com.baizhi;

import com.baizhi.entity.Emp;
import com.baizhi.service.EmpService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootEmsApplicationTests {
    @Autowired
    private EmpService empService;
    @Test
    public void contextLoads() {
        List<Emp> all=empService.getAll(1,1);
        System.out.println(all.get(0));
        System.out.println(empService.getAll(1,1));
    }

}
