package com.app.labs;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
	ClassPathResource resource = 	new ClassPathResource("applicationcontext.xml");
	BeanFactory factory  = new XmlBeanFactory(resource);
	SpringBasic basic = (SpringBasic)factory.getBean("studentbean");
	basic.display();
	

	}

}
