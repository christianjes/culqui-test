package com.example.demo.util;

public class PaymentCardUtil {

	public static final int CARD_NUMBER_BEGIN_INDEX = 0;
	public static final int CARD_NUMBER_END_INDEX = 6;

	public static String getFirstSixDigits(String cardNumber) {
		return cardNumber.substring(CARD_NUMBER_BEGIN_INDEX, CARD_NUMBER_END_INDEX);
	}

}
