package com.example.entrack.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class CustomUserDetailsService {
    @Bean
    public UserDetailsService userDetailsService() {

        UserDetails user = User
                .withUsername("udita")
                .password("{noop}udita123")
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user);
    }

}