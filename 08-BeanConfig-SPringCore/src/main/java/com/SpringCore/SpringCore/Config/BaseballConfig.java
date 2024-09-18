package com.SpringCore.SpringCore.Config;

import com.SpringCore.SpringCore.Service.BaseballCoach;
import com.SpringCore.SpringCore.Service.Coach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseballConfig {
    @Bean("wildsport")
    public Coach baseballCoach(){
        return new BaseballCoach();
    }
}
