package com.ankesh.cdkCommunityDev.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private PasswordEncoder passwordConfig;

    public SecurityConfig(PasswordEncoder passwordConfig){
        this.passwordConfig = passwordConfig;
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
    http
            .authorizeRequests()
            .antMatchers("/")
            .permitAll()
            .anyRequest()
            .authenticated()
            .and()
            .httpBasic();
    }

    @Override
    @Bean
    protected UserDetailsService userDetailsService() {
        UserDetails lokesh = User.builder()
                .username("lokesh")
                .password( passwordConfig.encode("kankariya"))
                .roles("STUDENT")
                .build();

        UserDetails ankesh =  User.builder()
                .username("Ankesh")
                .password(passwordConfig.encode( "gupta"))
                .roles("ADMIN")
                .build();


        return  new InMemoryUserDetailsManager(
                lokesh,
                ankesh
        );
    }
}


