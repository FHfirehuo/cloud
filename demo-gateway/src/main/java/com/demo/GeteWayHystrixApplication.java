
package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController

@SpringBootApplication
public class GeteWayHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeteWayHystrixApplication.class, args);
	}

	// 我们使用了另外一个router，该router使用host去断言请求是否进入该路由，
	// 当请求的host有“*.hystrix.com”，都会进入该router，该router中有一个hystrix的filter,
	// 该filter可以配置名称、和指向性fallback的逻辑的地址，比如本案例中重定向到了“/fallback

//	@Bean
//	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
//		// 可见当我们向gateway工程请求“/api/v1/user/**”,gateway会将工程的请求转发到“http://192.168.12.33:8083”，并且在转发之前，加上一个filter，该filter会将请求添加一个header,key为hello，value为world。
//		return builder.routes()
//				.route(p -> p.path("/api/v1/user/**").filters(f -> f.addRequestHeader("Hello", "World"))
//						.uri("http://192.168.12.33:8083"))
//				.route(p -> p.host("*.hystrix.com")
//						.filters(f -> f.hystrix(config -> config.setName("mycmd").setFallbackUri("forward:/fallback")))
//						.uri("http://192.168.12.33:8083"))
//
//				.build();
//	}

	// 使用curl执行以下命令：curl --dump-header - --header 'Host: www.hystrix.com'
	// http://localhost:8080/delay/3 .build(); }

	// Mono是一个Reactive stream，对外输出一个“fallback”字符串。

	@RequestMapping("fallback")
	public Mono<String> fallback() {
		return Mono.just("fallback");
	}
}
