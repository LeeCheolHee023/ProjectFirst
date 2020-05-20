package com.yedam.exceptions;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void login(String id, String password) throws NotExistIdException, WrongPasswordException {
		if (id.equals("blue")) {
			System.out.println("id가 일치하지 않습니다.");
		}
		if (!password.equals("12345")) {
			System.out.println("password가 일치하지 않습니다.");
		}
	}

}
