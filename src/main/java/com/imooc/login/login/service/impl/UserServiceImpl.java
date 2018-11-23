package com.imooc.login.login.service.impl;

import com.imooc.login.login.entity.User;
import com.imooc.login.login.repository.UserRepository;
import com.imooc.login.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
  @PostConstruct
  @Transactional
    public void admin() throws Exception{
      System.out.println("JavaBean类init 方法");
      List<User> list = userRepository.findAll();
      if(list.size() <= 0){
          User user = new User();
          user.setUserName("admin");
          String password = new BCryptPasswordEncoder().encode("123456");
          user.setPassword(password);
          userRepository.save(user);
      }
  }
}
