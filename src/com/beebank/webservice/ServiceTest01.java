package com.beebank.webservice;

import java.util.HashMap;
import java.util.Map;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;
@WebService
public class ServiceTest01 {
	
	public Map<String, Object> aaa(String name){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", name);
		return null;
	}
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:901/TheWebService/ServiceTest01", new ServiceTest01());
		// Endpoint.publish("http://localhost:901/TheWebService/ServiceHello", new ServiceHello());
		System.out.println("service success");
	}

}
