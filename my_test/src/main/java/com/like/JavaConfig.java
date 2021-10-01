package com.like;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: spring
 * @description: hh
 * @author: Like
 * @create: 2021-09-29 20:56
 **/
@Configuration
@ComponentScan
public class JavaConfig {

	@Bean
	public User user(){
		return new User("001","smart哥");
	}
}
