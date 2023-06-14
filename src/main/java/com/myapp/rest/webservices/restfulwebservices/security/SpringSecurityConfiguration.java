package com.myapp.rest.webservices.restfulwebservices.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        // all requests should be authenticated
        httpSecurity.authorizeHttpRequests(auth -> auth.anyRequest().authenticated());
        // if a request is not authenticated, a web page is shown
        httpSecurity.httpBasic(Customizer.withDefaults());
        //csrf --> post, put
        httpSecurity.csrf().disable();
        return httpSecurity.build();
    }
}
