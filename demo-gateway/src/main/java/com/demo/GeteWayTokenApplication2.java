package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import com.demo.filter.TokenFilter;

@RestController
@SpringBootApplication
public class GeteWayTokenApplication2 {

	public static void main(String[] args) {
		SpringApplication.run(GeteWayTokenApplication2.class, args);
	}
//访问http://localhost:8080/api/v1/user/oa/liuyi27
//转发至	http://192.168.12.33:8083/api/v1/user/oa/liuyi27

	@Bean
	public TokenFilter tokenFilter() {
		return new TokenFilter();
	}

}
