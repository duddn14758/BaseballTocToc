package com.java.baseball.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.java.baseball.dao.IPlayingRepository;
import com.java.baseball.model.Customer;

public class TotoService implements ITotoService{
	//@Autowired
	
	IPlayingRepository rp;
	Customer c=new Customer();	
	
	public void run() {
		System.out.println("토토서비스시작..");
		//시뮬레이션 기능 및 추천기능
	}

	@Override
	public void batting() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int forecast() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public Customer getCustomer(Customer cust) {
		// TODO Auto-generated method stub
		c.setId("happy");
		return c;
	}
}
