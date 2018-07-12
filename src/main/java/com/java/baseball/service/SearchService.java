package com.java.baseball.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.java.baseball.dao.ISearchRepository;
import com.java.baseball.model.Player;

public class SearchService implements ISearchService{
	//@Autowired
	@Qualifier("srps")
	ISearchRepository isr;
	
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

	@Override
	public Player p_info(String name) {
		// TODO Auto-generated method stub
		return isr.getP(name);
	}

}
