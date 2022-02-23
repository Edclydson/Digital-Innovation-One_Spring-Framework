package com.bean.spring_beans.config;

import com.bean.spring_beans.userRepository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class beanConfig {
    
    @Bean
    public userRepository criadorDeUserRepository(){
        return new userRepository();
    }
}
