package com.example.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.PaymentCard;
import com.example.demo.bean.PaymentCardDetail;
import com.example.demo.bean.TokenLive;
import com.example.demo.service.ApiService;
import com.example.demo.util.DateUtil;
import com.example.demo.util.PaymentCardUtil;
import com.example.demo.util.TokenUtil;

@RestController
public class TokenController {
	private ApiService apiService;
	private DateUtil dateUtil;
	private PaymentCardUtil paymentCardUtil;
	private TokenUtil tokenUtil;

	public TokenController(ApiService apiService) {
		this.apiService = apiService;
		dateUtil = new DateUtil();
		paymentCardUtil = new PaymentCardUtil();
		tokenUtil = new TokenUtil();
	}

	@RequestMapping(value = "/tokens", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public TokenLive getTokens(PaymentCard card) {
		String number = card.getNumber();
		String firstSixDigits = paymentCardUtil.getFirstSixDigits(number);
		PaymentCardDetail cardDetail = apiService.getCardDetail(firstSixDigits);
		TokenLive tokenLive = new TokenLive();
		tokenLive.setBrand(cardDetail.getScheme());
		String currentDate= dateUtil.getCurrentDate();
		tokenLive.setCreationDate(currentDate);//"2019-01-01 18:00:00"
		String token = tokenUtil.buildTokenLive(card);
		tokenLive.setToken(token);
		return tokenLive;

	}

}
