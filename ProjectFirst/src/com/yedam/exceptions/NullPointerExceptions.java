package com.yedam.exceptions;

public class NullPointerExceptions {
	public static void main(String[] args) {
		String str = "null";
		try {
		System.out.println(str.toString());
		}catch(Exception e) {
			System.out.println("null값 참조");
		}
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * }catch(NullPointerException e) { System.out.println("실행중 오류가 발생"); }catch
		 * (Exception e) { System.out.println("알수없는 예외 발생."); e.printStackTrace();
		 */
		System.out.println("프로그램 종료");
	}
}

//예외처리 기능 / 오류가 발생했을때 try구문을 실행한다.
