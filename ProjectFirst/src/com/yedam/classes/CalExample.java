package com.yedam.classes;

public class CalExample {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.powerOn();
		int result1 = cal.sum(10,50);
		double result2 = cal.sum(10.5, 50.3);
		cal.println("30");
		cal.println(result1);
		cal.println(result2);
		
		double area1 = cal.getAreaRectangle(4.6, 5.5);
		cal.println("직사강형의 넓이값  " + area1);
		
		double area2 = cal.getAreaRectangle(5.5);
		cal.println(area2);
		
		 cal.getAreaRectangle(area1, area2);
		
		
	}

}
