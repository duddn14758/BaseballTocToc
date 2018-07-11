package com.java.baseball.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.baseball.service.*;

@Controller
public class BaseballController {
	//@Autowired
	ITotoService toto;
	
	@RequestMapping(value="/hr/toto")
	public String go(Model models) {
		return "/hr/toto";
	}	
	public void setTotoService(ITotoService ttService) {		
		this.toto = ttService;
	}
	public void run() {		
		toto.run();
	}
}
