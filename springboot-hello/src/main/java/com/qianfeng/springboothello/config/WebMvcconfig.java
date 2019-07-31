package com.qianfeng.springboothello.config;

import com.qianfeng.springboothello.interceptor.Authinterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author:wh
 * @Date:2019/7/29
 */
@Configuration
public class WebMvcconfig implements WebMvcConfigurer{

    @Autowired
    private Authinterceptor authinterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authinterceptor).addPathPatterns("/**");
    }
}
