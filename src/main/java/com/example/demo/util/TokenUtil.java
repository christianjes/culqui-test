package com.example.demo.util;

import com.example.demo.bean.PaymentCard;

public class TokenUtil {
	public static String TOKEN_LIVE_TEMPLATE = "tkn_live_%s-%s-%s";// tkn_live_4444333322221111-2020-10

	public String buildTokenLive(PaymentCard paymentCard) {
		String pan = paymentCard.getNumber();
		String expirationYear = String.valueOf(paymentCard.getExpirationYear());
		String expirationMonth = String.valueOf(paymentCard.getExpirationMonth());
		return String.format(TOKEN_LIVE_TEMPLATE, pan, expirationYear, expirationMonth);
	}

}
