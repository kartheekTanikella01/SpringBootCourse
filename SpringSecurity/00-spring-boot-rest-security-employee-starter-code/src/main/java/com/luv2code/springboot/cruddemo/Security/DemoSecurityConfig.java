package com.luv2code.springboot.cruddemo.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class DemoSecurityConfig {
    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){
        UserDetails john= User.builder()
                .username("john")
                .password("{noop}test123")
                .roles("Employee")
                .build();
        UserDetails mary= User.builder()
                .username("mary")
                .password("{noop}test123")
                .roles("Employee","Manager")
                .build();
        UserDetails susan= User.builder()
                .username("susan")
                .password("{noop}test123")
                .roles("Employee","Manager","Admin")
                .build();
        return new InMemoryUserDetailsManager(john,mary,susan);
    }
    //restrict acces based on roles
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        //authorize http request
        http.authorizeHttpRequests(configure ->configure.requestMatchers(HttpMethod.GET,"/api/employees").hasRole("Employee")
                .requestMatchers(HttpMethod.GET,"/api/employees").hasRole("Employee")
                .requestMatchers(HttpMethod.GET,"/api/employees").hasRole("Employee")
                .requestMatchers(HttpMethod.POST,"/api/employees").hasRole("Manager")
                .requestMatchers(HttpMethod.PUT,"/api/employees").hasRole("Manager")
                .requestMatchers(HttpMethod.DELETE,"/api/employees").hasRole("Admin")

        );
        //use httpBasic Authentication
        http.httpBasic(Customizer.withDefaults());

        //disable csrf
        http.csrf(csrf->csrf.disable());
        return http.build();
    }
}
