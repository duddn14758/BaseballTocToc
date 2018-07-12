package com.java.baseball.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.baseball.model.Player;
import com.java.baseball.service.*;

@Controller
public class SearchController {	//검색 및
	//@Autowired
	ISearchService ISS;
	
/*
	@RequestMapping(value="/hr/{playername}")
	public String smain(@PathVariable String playername, Model model) {
		Player p = ISS.p_info(playername);
		model.addAttribute("player", p);
		return "/hr/search";
	}
	*/
	@RequestMapping(value="/hr/search", method=RequestMethod.POST)
	public String searchname(Model models) {
		return "/hr/search";
	}
	
	@RequestMapping(value="/hr/{playername}")
	public String getpayerInfo(@PathVariable String name, Model model) {
		Player p = ISS.p_info(name);
		model.addAttribute("player", p);
		return "hr/view";
	}
	
	
	public void setSearchService(ISearchService sService) {
		this.ISS=sService;
	}
	
	public void prun() {
		ISS.p_info();
	}
	public void trun() {
		ISS.t_info();
	}
	
}
