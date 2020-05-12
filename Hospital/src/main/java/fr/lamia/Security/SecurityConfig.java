package fr.lamia.Security;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Bean
	public static PasswordEncoder passwordEncoder() {
	      return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}
	
	 @Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	auth.inMemoryAuthentication().withUser("junior").password("{noop}amine02").roles("ADMIN");
	auth.inMemoryAuthentication().withUser("lamia").password("{noop}lamss31").roles("user");
	auth.inMemoryAuthentication().withUser("rania").password("{noop}ran03").roles("user");
	}

    @Override
    protected void configure(HttpSecurity http) throws Exception {
       http.formLogin();
       http.authorizeRequests().anyRequest().authenticated();
       http.authorizeRequests();


    }
}