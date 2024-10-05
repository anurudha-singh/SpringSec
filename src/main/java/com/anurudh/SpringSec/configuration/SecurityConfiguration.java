package com.anurudh.SpringSec.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity. csrf(customizer -> customizer.disable());
        httpSecurity.authorizeHttpRequests(request-> request.anyRequest().authenticated());
        // httpSecurity.formLogin(Customizer.withDefaults()); //for web because it returns a default login form
        httpSecurity.httpBasic(Customizer.withDefaults());
        return httpSecurity.build();
    }
}
