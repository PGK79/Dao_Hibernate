package com.example.dao_with_hibernate.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

@Configuration
public class PersonSecurityConfiguration extends WebSecurityConfigurerAdapter { //Deprecated класс по условию задачи
    private final DataSource dataSource;

    public PersonSecurityConfiguration(@Autowired DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                .and()
                .authorizeRequests().antMatchers("/persons/by-age").hasRole("Investigator")
                .and()
                .authorizeRequests().antMatchers("/persons/by-fullname").hasRole("Mistress")
                .and()
                .authorizeRequests().anyRequest().authenticated();
    }
}
