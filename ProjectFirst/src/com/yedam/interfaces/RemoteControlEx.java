package com.yedam.interfaces;

public class RemoteControlEx {
	RemoteControl rc = new Audio();
	rc.turnOn();
	rc.turnOff();
	
	rc = new Television();
	rc.turnOn();
	rc.turnOff();
	
	RemoteControl rc2 = new RemoteControl() {
	
	public void turnOn() {
		System.out.println("익명 개체 켭니다.");
	}
	public void turnOff() {
		System.out.println("익명 개체 끕니다.");
	};
	rc2.turnOn();
	rc2.turnOff();
	}
}
