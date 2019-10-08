package com.example.demo.util;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class DateUtilTest {
	
	@Test
	public void shouldGetCurrentDateAsString() {
		String currentDateAsString = DateUtil.getCurrentDate();
		assertNotNull(currentDateAsString);
	}

}
