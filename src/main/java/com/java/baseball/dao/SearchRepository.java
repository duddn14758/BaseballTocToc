package com.java.baseball.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SearchRepository implements ISearchRepository{
	//@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void func() {
		// TODO Auto-generated method stub
		System.out.println("SearchRpository 접근");
	}
}
