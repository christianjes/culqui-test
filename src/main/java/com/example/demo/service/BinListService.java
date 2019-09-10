package com.example.demo.service;

import com.example.demo.bean.PaymentCardDetail;

public interface BinListService {
	
	public PaymentCardDetail getCardDetail(String code);
}
