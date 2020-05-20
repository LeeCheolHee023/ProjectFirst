package com.yedam.exceptions;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		int[] intAry = new int[5];

		for (int i = 0; i <= intAry.length; i++) {
			try {
				int num1 = Integer.parseInt(args[0]);
				intAry[i] = i + 1;
				System.out.println(intAry[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 범위를 초과했습니다. intAry[" + i + "]");
			} catch (NumberFormatException e1) {
				System.out.println("변환 불가.");
			}
		}
		System.out.println("end of program");
	}

}
