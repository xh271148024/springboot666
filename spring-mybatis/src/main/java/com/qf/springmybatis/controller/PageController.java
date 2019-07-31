package com.qf.springmybatis.controller;

import com.qf.springmybatis.entity.TUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author:wh
 * @Date:2019/7/30
 */
@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("hello")
    public String showPage(ModelMap map){

        //int i=1/0;

        String name="张三丰";
        map.put("username",name);

        TUser tUser=new TUser(2,"梅梅","123");
        map.put("tUser",tUser);
        map.put("money",1000);

        List<TUser> userList=new ArrayList<>();
        userList.add(new TUser(3,"ss","123"));
        userList.add(new TUser(4,"bb","122"));
        userList.add(new TUser(5,"cc","111"));
        map.put("userList",userList);

        map.put("now",new Date());
        return "hello";
    }

    @RequestMapping("user")
    public String getuser(@Valid TUser tUser,BindingResult bindingResult){
        System.out.println(tUser.getName());
        return "ok";
    }
}
