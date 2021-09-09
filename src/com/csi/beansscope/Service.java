package com.csi.beansscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Service {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		Customer cc1 = (Customer) context.getBean("cust");

		cc1.setCustId(121);
		cc1.setCustName("SWARA");

		System.out.println("Customer Id: " + cc1.getCustId() + "\n Customer Name: " + cc1.getCustName());

		Customer cc2 = (Customer) context.getBean("cust");

		System.out.println("Customer Id: " + cc2.getCustId() + "\n Customer Name: " + cc2.getCustName());

	}
}
