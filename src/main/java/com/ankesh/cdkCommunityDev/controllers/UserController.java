package com.ankesh.cdkCommunityDev.controllers;


import com.ankesh.cdkCommunityDev.mappers.UserMapper;
import com.ankesh.cdkCommunityDev.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
@Autowired
private UserMapper userMapper;
@RequestMapping("/all")
public List<User> getAll(){
    System.out.println("in here");
return userMapper.findAll();
}


}
