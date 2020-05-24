package com.tfq.springaop.service;

import org.springframework.stereotype.Service;

/**
 *
 *  @description 奔驰汽车
 *  @author tangfq; 
 *  @version 2020年5月24日 下午9:38:00
 *
 **/
@Service
public class BenzCar implements ICar{
	
	@Override
	public String startEngine() {
		return "I am driving Benz car";
	}

}
