package com.tfq.springaop.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tfq.springaop.service.ICar;

/**
 *
 *  @description 
 *  @author tangfq; 
 *  @version 2020年5月24日 下午3:35:44
 *
 **/
@RestController
@RequestMapping("/car")
public class CarController {

	@Resource
	private ICar car;
	
	@RequestMapping("/start")
	public String startEngine(){
		return car.startEngine();
	}
	
}
