package br.com.springjsf.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    protected void configure(HttpSecurity http) {
        try {
            http.csrf().disable().authorizeRequests().antMatchers("/javax.faces.resource/**").permitAll().anyRequest()
                    .authenticated().and().formLogin().failureUrl("/login.jsf?error=true")
                    .defaultSuccessUrl("/app/index.xhtml").and().logout().logoutUrl("/sair")
                    .deleteCookies("JSESSIONID");
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().passwordEncoder(bCryptPasswordEncoder).withUser("admin")
                .password(passwordEncoder().encode("admin")).roles("USER");
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
