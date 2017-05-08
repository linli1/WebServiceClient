package com.beebank.webservice;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.beebank.impl.HelloServiceImpl;

/**
 * @author l.l 发布web服务
 *
 */
public class SoapServer {

	/*
	 * public static void main(String[] args) {
	 * Endpoint.publish("http://127.0.0.1:8080/helloService", new
	 * HelloServiceImpl()); }
	 */

	public static void main(String[] args) {
		JaxWsServerFactoryBean soapFactoryBean = new JaxWsServerFactoryBean();
		soapFactoryBean.getInInterceptors().add(new LoggingInInterceptor());
		soapFactoryBean.getOutInterceptors().add(new LoggingOutInterceptor());
		// 注意这里是实现类不是接口
		soapFactoryBean.setServiceClass(HelloServiceImpl.class);
		soapFactoryBean.setAddress("http://127.0.0.1:8080/helloService");
		soapFactoryBean.create();
	}

}
