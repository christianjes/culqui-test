package com.example.demo.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.example.demo.bean.PaymentCardDetail;
import com.example.demo.configuration.ApiProperties;
import com.example.demo.service.ApiService;

public class ApiServiceImpl implements ApiService {
	
	private RestTemplate restTemplate;
	private ApiProperties apiProperties;

	@Autowired
	public ApiServiceImpl(RestTemplate restTemplate,ApiProperties apiProperties) {
		this.restTemplate = restTemplate;
		this.apiProperties = apiProperties;
	}

	@Override
	public PaymentCardDetail getCardDetail(String code) {
		String url = apiProperties.getUrl();
		Map<String,String> uriVariables = new HashMap<>();
		uriVariables.put("{first-six-digits-payment-card}", code);
		return restTemplate.getForObject(url, PaymentCardDetail.class, uriVariables);
	}

}
