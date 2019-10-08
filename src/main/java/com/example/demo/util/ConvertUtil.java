package com.example.demo.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class ConvertUtil {
	private static Logger logger = LoggerFactory.getLogger(ConvertUtil.class);
	private static final ObjectMapper mapper = new ObjectMapper();

	public static String fromObjectToJsonString(Object object) {
		String json = "";
		try {
			ObjectWriter objectWriter = mapper.writerWithDefaultPrettyPrinter();
			json = objectWriter.writeValueAsString(object);
		} catch (Exception ex) {
			ex.printStackTrace();
			logger.error(ex.getMessage());
		}
		return json;
	}

}
