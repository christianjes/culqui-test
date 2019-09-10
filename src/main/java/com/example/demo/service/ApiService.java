package com.example.demo.service;

import com.example.demo.bean.PaymentCardDetail;

public interface ApiService {
	
	public PaymentCardDetail getCardDetail(String code);
}
