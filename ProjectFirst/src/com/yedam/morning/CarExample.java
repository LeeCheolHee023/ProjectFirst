package com.yedam.morning;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setSpeed(90);
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		myCar.setSpeed(100);
		
		if(myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 속도 : " + myCar.getSpeed() );
	}

}
