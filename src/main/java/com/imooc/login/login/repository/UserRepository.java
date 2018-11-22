package com.imooc.login.login.repository;

import com.imooc.login.login.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>{
     User findByUserName(String userName);
}
