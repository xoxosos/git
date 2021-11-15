package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.User;

import java.util.List;

/**
 * @author ：LinRenJie
 * @description：TODO
 * @date ：2021/11/14 21:29
 */
public interface UserService extends IService<User> {
    public User  getUser(Long id);
    public int addUser(User user);
    public int deleteByid(Long id);
    public int updateUsers(User user);
    public List<User> getAll(User user);

}
