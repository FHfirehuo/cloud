package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

import com.demo.filter.factory.RequestTimeGatewayFilterFactory;

public class GeteWayRequestTimeFilterFactoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeteWayRequestTimeFilterApplication.class, args);
	}
	// 访问http://localhost:8080/api/v1/user/oa/liuyi27
	// 转发至 http://192.168.12.33:8083/api/v1/user/oa/liuyi27

	@Bean
	public RequestTimeGatewayFilterFactory elapsedGatewayFilterFactory() {
		return new RequestTimeGatewayFilterFactory();
	}

}
