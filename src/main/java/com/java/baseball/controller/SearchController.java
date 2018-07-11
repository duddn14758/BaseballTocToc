package com.java.baseball.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.baseball.service.*;

@Controller
public class SearchController {	//검색 및
	//@Autowired
	ISearchService ISS;

	@RequestMapping(value="/hr/search")
	public String go(Model models) {
		return "/hr/search";
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
