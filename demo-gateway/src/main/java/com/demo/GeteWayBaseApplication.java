package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GeteWayBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeteWayBaseApplication.class, args);
	}
//访问http://localhost:8080/api/v1/user/oa/liuyi27
//转发至	http://192.168.12.33:8083/api/v1/user/oa/liuyi27

//	@Bean
//	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
//		// 可见当我们向gateway工程请求“/api/v1/user/**”,gateway会将工程的请求转发到“http://192.168.12.33:8083”，并且在转发之前，加上一个filter，该filter会将请求添加一个header,key为hello，value为world。
//		return builder.routes()
//				.route(p -> p.path("/api/v1/user/**").filters(f -> f.addRequestHeader("Hello", "World"))
//				.uri("http://192.168.12.33:8083"))
//				.build();
//	}

}
