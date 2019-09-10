package com.example.demo.controller;

import java.util.Date;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Card;
import com.example.demo.bean.CardDetail;
import com.example.demo.bean.TokenLive;
import com.example.demo.service.ApiService;

@RestController
public class TokenController {
	private ApiService apiService;

	public TokenController(ApiService apiService) {
		this.apiService = apiService;
	}

	@RequestMapping(value = "/tokens", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public TokenLive getTokens(Card card) {
		String number = card.getNumber();
		String code = number.substring(0, 6);
		CardDetail cardDetail = apiService.getCardDetail(code);
		// build tokenLive
		TokenLive tokenLive = new TokenLive();
		tokenLive.setBrand(cardDetail.getScheme());
		Date currentDate = new Date();
		
//		tokenLive.setCreationDate();//"2019-01-01 18:00:00"
		return null;

	}

}
