package com.sqli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.netty.resolver.DefaultAddressResolverGroup;
import reactor.netty.http.client.HttpClient;

@SpringBootApplication
@Configuration
@EnableDiscoveryClient
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}
	@Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/account/**")
                        .uri("lb://service-account"))
                .route(r -> r.path("/customer/**")
                        .uri("lb://customer-service"))
                .route(r -> r.path("/feedback/**")
                        .uri("lb://feedback-service"))
                .route(r -> r.path("/transaction/**")
                        .uri("lb://transaction-service"))
                .route(r -> r.path("/user/**")
                        .uri("lb://user-service"))
                .build();
    }

    @Bean 
    public HttpClient httpClient() { 
        return HttpClient.create().resolver(
                DefaultAddressResolverGroup.INSTANCE); 
        }

}
