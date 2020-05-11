package com.yedam.classes;

public class People {
	String name;
	int age;
	int num;

 	void eat(String str) {
		System.out.println("먹는다.");
	}
	void job(String str) {
		System.out.println("일한다.");
	}
	void hobby(String str) {
		System.out.println("즐겨한다.");
	}
	public static void main(String[] args) {
		People pl = new People();
		pl.name = "Lee";
		pl.age = 27;
		pl.num = 1234;
		pl.eat("apple");
		pl.job("student");
		pl.hobby("game");
		System.out.println("이름: " + pl.name + ", 나이: " + pl.age + ", 번호 : " + pl.num);
	}
}
