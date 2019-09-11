package com.example.demo.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertUtil {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	private ObjectMapper mapper;
	public ConvertUtil() {
		mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		mapper.setSerializationInclusion(Include.NON_EMPTY);
	}
	
	public String fromObjectToJsonString(Object object) {
		String json = "";
		try {
			json = mapper.writeValueAsString(object);
		}catch(Exception ex) {
			ex.printStackTrace();
			logger.error(ex.getMessage());
		}
		
		return json;
	}

}
