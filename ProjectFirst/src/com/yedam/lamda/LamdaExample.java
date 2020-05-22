package com.yedam.lamda;
//class MyFuncClass implements MyfuntionalInterface{

//	@Override 
//	public void run() {
//		System.out.println("실행.");
//	}
//	
//}
public class LamdaExample {
	public static void main(String[] args) {
//		MyfuntionalInterface f1 = new MyfuntionalInterface() {
//			// 익명 구현객체
//			// 1) 매개값이 없는 인더페이스
//			@Override
//			public void run() {
//				System.out.println("실행.");
//			}
//
//		};
//		f1.run();

		// 간단한 람다표현식 > run() 메소드 구현하는 부분.
		MyfuntionalInterface f2 = a -> System.out.println("실행.");
		f2.run("");

		// 2) 매개값이 있는 인터페이스
		MySumInterpace si = (num1, num2) -> {
			int result = num1 + num2;
			System.out.println("두수의 합 : " + result);
		};
		si.sum(10, 20);

		// 3)반환값이 있는 매개값 인터페이스
		MyMultiInterface mi = (num1, num2) -> {
			return num1 * num2;
		};
		int result  = mi.multi(10, 15);
		System.out.println("결과값은 : " + result);
	}
}
