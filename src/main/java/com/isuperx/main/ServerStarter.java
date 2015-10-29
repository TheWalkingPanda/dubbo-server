package com.isuperx.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServerStarter {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		context.start();
		System.out.println(111);
		System.in.read();
	}
}
