package com.example.demo.interceptor;

import java.io.IOException;
import java.nio.charset.Charset;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.util.StreamUtils;

public class RequestResponseLoggingInterceptor implements ClientHttpRequestInterceptor {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
			throws IOException {
		logRequest(request, body);
		ClientHttpResponse response = execution.execute(request, body);
		logResponse(response);
		return response;
	}

	private void logRequest(HttpRequest request, byte[] body) throws IOException {
		logger.info("===========================request begin================================================");
		logger.info("URI         : {}" + request.getURI());
		logger.info("Method      : {}" + request.getMethod());
		logger.info("Headers     : {}" + request.getHeaders());
		logger.info("Request body: {}" + new String(body, "UTF-8"));
		logger.info("==========================request end================================================");
	}

	private void logResponse(ClientHttpResponse response) throws IOException {

		logger.info("============================response begin==========================================");
		logger.info("Status code  : {}" + response.getStatusCode());
		logger.info("Status text  : {}" + response.getStatusText());
		logger.info("Headers      : {}" + response.getHeaders());
		logger.info("Response body: {}" + StreamUtils.copyToString(response.getBody(), Charset.defaultCharset()));
		logger.info("=======================response end=================================================");
	}

}
