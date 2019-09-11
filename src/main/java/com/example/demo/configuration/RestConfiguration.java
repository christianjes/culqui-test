package com.example.demo.configuration;

import java.util.Collections;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.example.demo.interceptor.RequestResponseLoggingInterceptor;

@Configuration
public class RestConfiguration {

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		RestTemplate restTemplate = builder.build();
		ClientHttpRequestFactory factory = new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory());
		restTemplate.setRequestFactory(factory);
		restTemplate.setInterceptors(Collections.singletonList(new RequestResponseLoggingInterceptor()));
		return restTemplate;
	}

}
