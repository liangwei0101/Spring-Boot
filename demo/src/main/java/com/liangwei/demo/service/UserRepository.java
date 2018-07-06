package com.liangwei.demo.service;

import com.liangwei.demo.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

//    List<User> getUserList();
//
//    User addUserInfo(User userInfo);
//
//    User updateUserInfoById(User userInfo);
//
//    void deleteUserInfoById(int Id);

}
