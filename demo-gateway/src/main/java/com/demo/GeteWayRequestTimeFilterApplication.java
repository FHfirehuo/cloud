package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import com.demo.filter.RequestTimeFilter;

@RestController
@SpringBootApplication
public class GeteWayRequestTimeFilterApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeteWayRequestTimeFilterApplication.class, args);
	}
	//访问http://localhost:8080/api/v1/user/oa/liuyi27
	//转发至	http://192.168.12.33:8083/api/v1/user/oa/liuyi27
//	@Bean
//	public RouteLocator customerRouteLocator(RouteLocatorBuilder builder) {
//		// @formatter:off
//		return builder.routes()
//				.route(r -> r.path("/api/v1/user/**")
//						.filters(f -> f.filter(new RequestTimeFilter()).addResponseHeader("X-Response-Default-Foo",
//								"Default-Bar"))
//						.uri("http://192.168.12.33:8083").order(0).id("customer_filter_router"))
//				.build();
//		// @formatter:on
//	}
}
