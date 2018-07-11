package com.java.baseball;

import org.springframework.context.support.AbstractApplicationContext;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.java.baseball.controller.*;

public class BaseballMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-config.xml");
		BaseballController baseController = (BaseballController) context.getBean("baseController");
		SearchController seaController=(SearchController)context.getBean("seaController");
		
		//baseController.run();
		seaController.prun();
		seaController.trun();

		//어떤 서비스들을 실행시킬지..
	}
}
