package com.java.baseball.dao;

import com.java.baseball.model.*;

public interface IPlayingRepository{
	Player p=new Player();
	Customer c=new Customer();
	
	Customer getCustinfo(String name);
	
}
