package com.github.xxbeanxx.webservice;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.github.xxbeanxx.webservice.jaxb.TestRequest;
import com.github.xxbeanxx.webservice.jaxb.TestResponse;

/**
 * @author Greg Baker
 */
@Endpoint
public class TestEndpoint {

	private static final String NAMESPACE = "http://github.com/xxbeanxx/jax-ws-webservice";

	@PayloadRoot(namespace = NAMESPACE, localPart = "TestRequest")
	public @ResponsePayload TestResponse test(@RequestPayload TestRequest request) {
		return new TestResponse();
	}
	
}
