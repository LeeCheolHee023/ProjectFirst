package com.yedam.classes.inherit;

public class Company extends Friends{
	int emp;
	public Company(String name, int num, int emp) {
		super(name, num);
		this.emp = emp;
	}
	@Override
	void showInfo() {
		System.out.println("회사동료목록");
		System.out.println("이름"+ name + "전화번호" + num + "부서" + emp);
	}

	
}
