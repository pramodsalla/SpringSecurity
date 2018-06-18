package passion.SpringSecurity.Security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;


@Configuration 
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {

	
	protected void configure(AuthenticationManagerBuilder auth) throws  Exception{
		
		UserBuilder users = User.withDefaultPasswordEncoder();
		
		auth.inMemoryAuthentication().withUser(users.username("Pramod").password("test123").roles("Employee"))
		.withUser(users.username("Koushal").password("test123").roles("Employee","Manager"))
		.withUser(users.username("Nikki").password("test123").roles("Admin","RND","Employee"));
		
		
	}
	
	
	protected void configure(HttpSecurity http) throws Exception {
		

		http
			.authorizeRequests()
				.antMatchers("/").hasRole("Employee")
				.antMatchers("/leader/**").hasRole("Manager")
				.antMatchers("/admin/**").hasRole("Admin")
				.and()
			.formLogin().loginPage("/showMyLoginPage")
			.loginProcessingUrl("/authenticateTheUser")
			.permitAll().and().logout().permitAll().and().exceptionHandling()
			.accessDeniedPage("/access-denied");
	}
	 
}
