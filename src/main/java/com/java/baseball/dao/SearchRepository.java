package com.java.baseball.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.java.baseball.model.Player;

@Repository
public class SearchRepository implements ISearchRepository{
	//@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void func() {
		// TODO Auto-generated method stub
		System.out.println("SearchRpository 접근");
	}

	@Override
	public Player getP(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}
