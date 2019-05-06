/**
 * 
 */
package com.fairfield.chalktalk.security.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author Ashwini Sajjan
 *
 */
@Configuration
@EnableWebSecurity
public class MySecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private MySimpleUrlAuthenticationSuccessHandler myAuthenticationSuccessHandler;
	
	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
		System.out.println("executing sql query");
		auth.jdbcAuthentication().dataSource(dataSource)
			.usersByUsernameQuery("select userName,password, isActive from user where userName=?")
			.authoritiesByUsernameQuery("SELECT user.username as username, role.role as role \r\n" + 
					"        FROM user \r\n" + 
					"        INNER JOIN user_roles ON user.userid = user_roles.userid \r\n" + 
					"        INNER JOIN role ON user_roles.role_id = role.role_id\r\n" + 
					"        WHERE user.userName = ?  ")
			.passwordEncoder(getPasswordEncoder());
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
		    .antMatchers("/").permitAll()
			.and()
				.formLogin().loginPage("/login").failureUrl("/login?error")
			.successHandler(myAuthenticationSuccessHandler)
			.and()
				.logout().logoutSuccessUrl("/login?logout")
			.and()
			.csrf().disable();
	}

	/**
	 * @param dataSource the dataSource to set
	 */
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	/**
	 * @param myAuthenticationSuccessHandler the myAuthenticationSuccessHandler to set
	 */
	public void setMyAuthenticationSuccessHandler(MySimpleUrlAuthenticationSuccessHandler myAuthenticationSuccessHandler) {
		this.myAuthenticationSuccessHandler = myAuthenticationSuccessHandler;
	}
	
	private PasswordEncoder getPasswordEncoder() {
        return new PasswordEncoder() {
            @Override
            public String encode(CharSequence charSequence) {
                return charSequence.toString();
            }

            @Override
            public boolean matches(CharSequence charSequence, String s) {
                return true;
            }
        };
    }
}
