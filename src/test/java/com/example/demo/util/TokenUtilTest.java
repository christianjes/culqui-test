package com.example.demo.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.demo.bean.PaymentCard;

public class TokenUtilTest {

	@Test
	public void shouldBuildTokenLive() {		
		PaymentCard paymentCard = new PaymentCard();
		paymentCard.setNumber("4444333322221111");
		paymentCard.setExpirationYear(2020);
		paymentCard.setExpirationMonth(10);
		assertEquals("tkn_live_4444333322221111-2020-10", TokenUtil.buildTokenLive(paymentCard));
	}
}
