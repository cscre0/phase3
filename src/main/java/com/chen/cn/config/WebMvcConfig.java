package com.chen.cn.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author Ll
 * @Date 2020/12/31 0:38
 */

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    /*跨域设置1.*/
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedHeaders("*")
                .allowedMethods("*")
                .allowCredentials(true);
    }

/* @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginIntercepter()).addPathPatterns("/**")
                .excludePathPatterns("/employee/doLogin", "/employee/getCode", "/", "/upload", "/css/**",
                        "/fonts/**",
                        "/images/**", "/js/**", "login.html");

    }*/

}

