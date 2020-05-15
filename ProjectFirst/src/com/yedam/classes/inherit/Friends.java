package com.yedam.classes.inherit;

public class Friends {
	String name;
	int num;

	public Friends(String name, int num) {
		this.name = name;
		this.num = num;
	}

	void showInfo() {
		System.out.println("이름" + name + "전화번호" + num);
	}

}
