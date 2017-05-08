package com.beebank.webservice;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

@WebService
@SOAPBinding(style=SOAPBinding.Style.RPC)  
public class ServiceHello {
	
	
	
	/** 
	 * @Title: getValue 
	 * @Description: 供客户端 调用的代码
	 * @param name
	 * @return
	 * @author l.l
	 * 2017年4月18日
	 */
	public String getValue(String name){
		return "my name is ："+name;
	}
	
	
	
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:901/TheWebService/ServiceHello", new ServiceHello());
		System.out.println("service success");
	}
}
