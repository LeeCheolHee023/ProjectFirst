package com.yedam.classes.statics;

public class CalExample {
	public static void main(String[] args) {
		Calculator.pi = 3.14;
		Calculator.sum(45, 55);
		//class 필드 메소드가 각각 다른값을 가지고있어야한다. 그럴필요가 없을땐 static 
	}

}
