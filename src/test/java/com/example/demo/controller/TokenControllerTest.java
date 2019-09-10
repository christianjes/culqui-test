package com.example.demo.controller;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.demo.bean.PaymentCard;
import com.example.demo.bean.TokenLive;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TokenControllerTest {

	@Autowired
	private TokenController tokenController;
	@Test
	public void shouldGetTokenLive() {
		PaymentCard card = new PaymentCard();
		card.setExpirationMonth(10);
		card.setExpirationYear(2020);
		card.setNumber("4444333322221111");
		TokenLive tokenLive = tokenController.getTokenLive(card);
		assertNotNull(tokenLive.getToken());
	}
}
