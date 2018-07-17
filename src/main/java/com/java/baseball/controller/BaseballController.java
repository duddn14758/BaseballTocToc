package com.java.baseball.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.baseball.model.Customer;
import com.java.baseball.service.*;

@Controller
public class BaseballController {
	//@Autowired
	ITotoService toto;
	Customer c=new Customer();
	/*
	@RequestMapping(value="/hr/toto")
	public String go(Model models) {
		return "/hr/toto";
	}
	*/
	public void setTotoService(ITotoService ttService) {		
		this.toto = ttService;
	}
	public void run() {		
		toto.run();
	}
	@RequestMapping(value="/hr/simul")
	public String simul(Model models) {
		return "hr/simul";
	}
	@RequestMapping(value="/hr/batting")
	public String batting(Model models) {
		return "hr/batting";
	}
	
	@RequestMapping(value="/hr/toto", method=RequestMethod.GET)
	public String getsession(Customer cust, Model model) {
		cust.setId("happy");
		cust.setBteam("롯데");
		cust.batting(2000);
		model.addAttribute("customer", cust);
		return "hr/toto";
	}
	
}
