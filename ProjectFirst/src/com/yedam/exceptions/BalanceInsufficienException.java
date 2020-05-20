package com.yedam.exceptions;

public class BalanceInsufficienException extends Exception {
	public BalanceInsufficienException() {
		System.out.println("잔고 부족합니다.");
	}

	public BalanceInsufficienException(String message) {
		super(message);
	}

}
