package br.com.ymotse.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import br.com.ymotse.api.filters.ErrorFilter;

/**
 * 
 * @author yitshhaq.fukushima
 *
 */
@EnableZuulProxy
@EnableEurekaClient
@EnableDiscoveryClient
@EnableCircuitBreaker
@SpringBootApplication
public class MicroserviceJavaGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceJavaGatewayApplication.class, args);
	}
	
	
	@Bean
	public ErrorFilter errorFilter() {
		return errorFilter();
	}
	
}
