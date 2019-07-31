package com.qf.springmybatis.service;

import com.qf.springmybatis.entity.TUser;

/**
 * @author:wh
 * @Date:2019/7/29
 */
public interface IuserService {
    TUser getUserById(Integer id);
}
