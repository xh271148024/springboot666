package com.qianfeng.springboothello.controller;

import com.qianfeng.springboothello.entity.Resource;
import com.qianfeng.springboothello.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author:wh
 * @Date:2019/7/29
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private Resource resource;

    @GetMapping("properties")
    public String showResource(){
        return resource.getImageServer()+","+resource.getEmailServer();
    }

    @RequestMapping("show")
    public String hello(){
        return "hello,springbootaaaa";
    }

    @RequestMapping("page")
    public String page(@RequestParam(name ="id",required =false,defaultValue ="1") Integer id){
        return "id="+id;
    }

    @GetMapping("page/{id}")
    public String page2(@PathVariable("id") Integer id){
        return "id="+id;
    }

    @PostMapping("add")
    public User add(User user){
        //user.setEntryDate(new Date());
        return user;
    }

}
