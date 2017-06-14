package it.uniroma3.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

   @Autowired
   private DataSource dataSource;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth
//		.inMemoryAuthentication()
//		.withUser("user").password("password").roles("USER")
		
		.jdbcAuthentication().dataSource(dataSource)
		
		.passwordEncoder(new BCryptPasswordEncoder())
		.usersByUsernameQuery("SELECT username,password,1 FROM users where username=?")
		.authoritiesByUsernameQuery("SELECT username,authority FROM authorities where username=?");
	}

   @Override
   protected void configure(HttpSecurity http) throws Exception {

       http
       .authorizeRequests()
       	   .antMatchers("/").permitAll()
       	   .antMatchers("/pagine che permettono le modifiche della galleria").access("hasAuthority('Administrator')")
           .anyRequest().authenticated()
           .and()
       .formLogin()
           .loginPage("/login").permitAll()
           .failureUrl("/login?error")
           .and()
       .logout()
          .logoutSuccessUrl("/login?loggedout")
          .permitAll();
   }
}