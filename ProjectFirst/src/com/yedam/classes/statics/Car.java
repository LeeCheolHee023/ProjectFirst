package com.yedam.classes.statics;

public class Car {
	private int speed; 
	private boolean stop;
	
	void setSpeed(int Speed) {
		if(speed < 0 ) {
			this.speed = 0;
		}else {
			this.speed= Speed;
		}
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed=0;
	}
	int getSpeed() {
		return this.speed;
	}

}
