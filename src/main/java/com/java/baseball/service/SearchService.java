package com.java.baseball.service;

import org.springframework.beans.factory.annotation.Autowired;

public class SearchService implements ISearchService{
	//@Autowired
	
	@Override
	public void p_info() {		
		// TODO Auto-generated method stub
		System.out.println("player information search tab");
	}

	@Override
	public void t_info() {
		// TODO Auto-generated method stub
		System.out.println("team information tab");
	}

}
