package com.yedam.interfaces;

public interface RemoteControl {
	//상수 final static 
	public int MAX_VOLUME = 0;
	public int MIN_VOLUME = 10;
	
	// 추상메소드
	public void turnOn();
	public void turnOff();
}
