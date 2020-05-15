package com.yedam.classes.inherit;

public class Unv extends Friends {
	String major;

	public Unv(String name, int num, String major) {
		super(name, num);
		this.major = major;
	}
	@Override
	void showInfo() {
		super.showInfo();
		System.out.println("전공" + major);
	}

}
