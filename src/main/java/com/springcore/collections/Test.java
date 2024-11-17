package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/collection_config.xml");
		springcore_collection col=(springcore_collection)context.getBean("col");
		System.out.println(col.getName());
		System.out.println(col.getPhones());
		System.out.println(col.getAddresses());
		System.out.println(col.getCourses());
		System.out.println(col.getProps());
	}

}
