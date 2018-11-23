package com.imooc.login.login.service.impl;

import com.imooc.login.login.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Service
public class UserServiceImpl implements UserService{
  @PostConstruct
  @Transactional
    public void admin() throws Exception{

  }
}
