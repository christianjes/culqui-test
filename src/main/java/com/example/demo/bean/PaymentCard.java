package com.example.demo.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentCard {
	@JsonProperty("pan")
	private String number;
	@JsonProperty("exp_year")
	private int expirationYear;
	@JsonProperty("exp_month")
	private int expirationMonth;

	public String getNumber() {
		return number;
	}

	
	public void setNumber(String number) {
		this.number = number;
	}

	public int getExpirationYear() {
		return expirationYear;
	}

	
	public void setExpirationYear(int expirationYear) {
		this.expirationYear = expirationYear;
	}

	public int getExpirationMonth() {
		return expirationMonth;
	}

	
	public void setExpirationMonth(int expirationMonth) {
		this.expirationMonth = expirationMonth;
	}

}
