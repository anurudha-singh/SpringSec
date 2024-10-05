package com.anurudh.SpringSec.configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity. csrf(customizer -> customizer.disable());
        httpSecurity.authorizeHttpRequests(request-> request.anyRequest().authenticated());
        // httpSecurity.formLogin(Customizer.withDefaults()); //for web because it returns a default login form
        httpSecurity.httpBasic(Customizer.withDefaults()); // it will prompt a popup on the web for authenticating the user
        return httpSecurity.build();
    }

    @Bean
    UserDetailsService userDetailsService(){
        UserDetails user1=User.withDefaultPasswordEncoder().username("anurudh_singh").password("test@123").roles("ADMIN").build();
        UserDetails user2=User.withDefaultPasswordEncoder().username("ankit").password("test@123").roles("USER").build();
        
        return new InMemoryUserDetailsManager(user1);
    }
}
