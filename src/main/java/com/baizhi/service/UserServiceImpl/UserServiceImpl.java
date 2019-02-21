package com.baizhi.service.UserServiceImpl;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userMapper;
    @Override
    public boolean select(String username, String password) {
        System.out.println(username+"-----------------------"+password);
        User user = userMapper.select(username);
        System.out.println("-----------------------");
        if(user==null||!password.equals(user.getPassword())){
            return false;
        }else{
            return true;
        }
    }
}
