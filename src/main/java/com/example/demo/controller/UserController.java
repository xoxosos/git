package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author ：LinRenJie
 * @description：TODO
 * @date ：2021/11/15 9:50
 */
@RestController
@RequestMapping("/user")
public class UserController {
  private final UserService userService;
@Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/get/{id}")
    public User getUser(@PathVariable("id") Long id){
        User user = userService.getUser(id);
        return user;
    }
    @GetMapping ("/add")
    public void addUser(User user){
        int i = userService.addUser(user);
        if (i!=1){
            throw  new RuntimeException("新增异常！");
        }
    }
    @GetMapping("/delete")
    public void deleteUser(Long id){
        int i = userService.deleteByid(id);
        if (i!=1){
            throw  new RuntimeException("删除出问题");
        }
    }
    @GetMapping("/update")
    public void updateUser(User user,Long id){
        User user1 = userService.getUser(id);
        int i = userService.updateUsers(user);
    }
}
