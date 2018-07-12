package com.java.baseball.service;

import com.java.baseball.model.Customer;

public interface ITotoService {
	void run();	//simulation run
	void batting();	//배팅
	int forecast();	//결과예상
	public Customer getCustomer(Customer cust);
}
