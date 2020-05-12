package com.yedam.classes.inherit;

public class CellPhone {
	// 필드
	String model;
	String color;
	
	//생성자
	CellPhone(String model, String color){
		this.model = model;
		this.color = color; 
	}
	
	//메소드
	void powerOn() {
		System.out.println("전원 켭니다.");
	}
	void bell() {
		System.out.println("벨 울립니다.");
	}
	void sendVoices(String message) {
		System.out.println("자신 : " + message);
	}
	void receiveVoices(String massage) {
		System.out.println("상대방 : " + massage);
	}
	void powerOff() {
		System.out.println("전원 끕니다.");
	}
}
