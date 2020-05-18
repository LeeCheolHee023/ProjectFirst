package com.yedam.morning;

public class Code20200518 {
	public static void main(String[] args) {
		int[] intary = { 10, 8, 5, 3, 7, 1 }; 
		int temp = 0;

		for (int j = 0; j < intary.length; j++) {
			for (int k = 0; k < intary.length; k++) {
				if (intary[j] < intary[k]) {

					temp = intary[j];
					intary[j] = intary[k];
					intary[k] = temp;
				}

			}
		}
		for (int i : intary) {
			System.out.println(i);
		}
	}
}
