package com.ibm.org.bian.config;

import org.springframework.context.annotation.Bean;

import com.ibm.org.bian.service.AccountI;
import com.ibm.org.bian.serviceImpl.AccountImpl;

@org.springframework.context.annotation.Configuration
public class Configuration {
	@Bean
	public AccountI getbean() {
		return new AccountImpl();
	}
}
