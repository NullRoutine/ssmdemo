package com.example.nullroutine.service.impl;

import com.example.nullroutine.entity.User;
import com.example.nullroutine.mapper.UserMapper;
import com.example.nullroutine.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getAll() {
        return userMapper.selectAll();
    }
}
