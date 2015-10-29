package com.isuperx.dubbo.service.impl;

import org.springframework.stereotype.Service;

import com.isuperx.dubbo.service.interfaces.IHelloService;

@Service("helloService")
public class HelloServiceImpl implements IHelloService {

	public void hello() {
		System.out.println("hello world!");
	}

}
