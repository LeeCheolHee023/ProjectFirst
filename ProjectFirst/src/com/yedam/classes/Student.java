package com.yedam.classes;

public class Student {
	String name;
	int age;
	double height;
	double weight;
	// 속성들  -> 필드라고 한다.
	
	public Student(String name) {
		this.name = name;
	}
	public Student() {
		
	}
	
	void study() {
		System.out.println("공부합니다.");
	}
	void exercise() {
		System.out.println("운동한다.");
	}
	void eat(String str) {
		System.out.println("먹는다");
	}
}
  	// 기능 -> 메소드