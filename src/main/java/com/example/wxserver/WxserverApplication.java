package com.example.wxserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class WxserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(WxserverApplication.class, args);
	}

}

