package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Wrapper;
import java.util.List;

/**
 * @author ：LinRenJie
 * @description：TODO
 * @date ：2021/11/15 9:38
 */
@Service
@Slf4j
public class UserServiceImpl  extends ServiceImpl<UserMapper,User> implements UserService {
    private final UserMapper userMapper;


    @Override
    @Transactional
    public int updateUsers(User user) {
        return userMapper.updateById(user);
    }

    @Override
    public List<User> getAll(User user) {
        return userMapper.selectList(query());
    }

    @Override
    public int deleteByid(Long id) {
        return userMapper.deleteById(id);
    }

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    @Override
    public User  getUser(Long id){
        return   userMapper.selectById(id);
    }
    @Override
    public int addUser(User user){
    return userMapper.insert(user);
    }
}