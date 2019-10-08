package com.example.demo.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static final String CREATION_DATE_PATTERN="yyyy-MM-dd HH:mm:ss";
	private static final DateFormat creationDateFormat = new SimpleDateFormat(CREATION_DATE_PATTERN);
	
	public static String getCurrentDate() {
		Date currentDate = new Date();
		return creationDateFormat.format(currentDate);
	}

}
