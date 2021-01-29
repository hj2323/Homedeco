package com.teamproject.teamproject01.service;

import com.teamproject.teamproject01.entity.User;
import com.teamproject.teamproject01.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public void join(User user) {
        userRepository.save(user);
    }

    @Override
    public User findById(String userid) {
        return userRepository.findById(userid).orElseThrow(()->{return new IllegalArgumentException("id 값이 없습니다.");});
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
