package com.java.baseball.model;

public class Customer {
	private String Id;
	private int wallet=0;
	private String bat_team="";
	private int bat_money=0;
	
	public Customer(String id) {
		this.Id=id;
	}

	public void init() {
		bat_team = "";
		bat_money = 0;
	}

	public boolean batting(int money) {
		if (wallet >= money) {
			wallet -= money;
			return true;
		} else {
			return false;
		}
	}
	
	public void winning(int baedang) {
		wallet+=bat_money*baedang;
	}
	
	public String getBteam() {
		return bat_team;
	}
	public void setBteam(String team) {
		bat_team=team;
	}
	public String getId() {
		return Id;
	}
	public int getWallet() {
		return wallet;
	}
	public int getBmoney() {
		return bat_money;
	}

}
