package com.teamproject.teamproject01.service;

import com.teamproject.teamproject01.entity.User;

import java.util.HashMap;
import java.util.List;

public interface UserService {
    //회원가입
    public void join(User user);

    //아이디로 회원 가져오기
    public User findById(String userid);

    //회원전체 가져오기
    public List<User> findAll();
}
