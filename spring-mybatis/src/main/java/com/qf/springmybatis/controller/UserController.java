package com.qf.springmybatis.controller;

import com.qf.springmybatis.entity.TUser;
import com.qf.springmybatis.service.IuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:wh
 * @Date:2019/7/29
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private IuserService iuserService;

    @GetMapping("getuser/{id}")
    public TUser getById(@PathVariable("id") Integer id){

        return iuserService.getUserById(id);
    }
}
