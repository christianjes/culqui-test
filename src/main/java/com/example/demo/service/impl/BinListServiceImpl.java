package com.example.demo.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.bean.PaymentCardDetail;
import com.example.demo.configuration.BinListProperties;
import com.example.demo.service.BinListService;

@Service
public class BinListServiceImpl implements BinListService {
	
	private RestTemplate restTemplate;
	private BinListProperties binListProperties;

	@Autowired
	public BinListServiceImpl(RestTemplate restTemplate,BinListProperties binListProperties) {
		this.restTemplate = restTemplate;
		this.binListProperties = binListProperties;
	}

	@Override
	public PaymentCardDetail getCardDetail(String code) {
		String url = binListProperties.getUrl();
		Map<String,String> uriVariables = new HashMap<>();
		uriVariables.put("first-six-digits-payment-card", code);
		return restTemplate.getForObject(url, PaymentCardDetail.class, uriVariables);
	}

}
