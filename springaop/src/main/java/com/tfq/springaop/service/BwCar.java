package com.tfq.springaop.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


/**
 *
 *  @description 宝马汽车实现Car接口
 *  @author tangfq; 
 *  @version 2020年5月24日 下午12:24:26
 *
 **/
@Service
@Primary
public class BwCar implements ICar{

	@Override
	public String startEngine() {
		
		return "I am driving bw car";
	}

}
