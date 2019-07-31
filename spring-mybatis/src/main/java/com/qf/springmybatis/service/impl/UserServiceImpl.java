package com.qf.springmybatis.service.impl;

import com.qf.springmybatis.entity.TUser;
import com.qf.springmybatis.mapper.TUserMapper;
import com.qf.springmybatis.service.IuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author:wh
 * @Date:2019/7/29
 */
@Service
public class UserServiceImpl implements IuserService{

    @Autowired
    private TUserMapper tUserMapper;

    @Override
    public TUser getUserById(Integer id) {
        return tUserMapper.selectByPrimaryKey(id);
    }
}
