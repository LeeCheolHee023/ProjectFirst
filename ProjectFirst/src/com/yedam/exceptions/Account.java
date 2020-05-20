package com.yedam.exceptions;

public class Account {
	private long balance;

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		this.balance += money;
	}

	public void withraw(int money) throws BalanceInsufficienException  {
		if(balance < money) {
			throw new BalanceInsufficienException();
		}
		this.balance -= money;
	}

}
