package com.example.demo.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static final String CREATION_DATE_PATTERN="yyyy-MM-dd HH:mm:ss";
	
	private DateFormat creationDateFormat;
	public DateUtil() {
		creationDateFormat = new SimpleDateFormat(CREATION_DATE_PATTERN);
	}
	
	public String getCurrentDate() {
		Date currentDate = new Date();
		return creationDateFormat.format(currentDate);
	}

}
