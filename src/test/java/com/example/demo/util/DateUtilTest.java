package com.example.demo.util;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class DateUtilTest {
	
	@Test
	public void shouldGetCurrentDateAsString() {
		DateUtil dateUtil = new DateUtil();
		String currentDateAsString = dateUtil.getCurrentDate();
		assertNotNull(currentDateAsString);
	}

}
