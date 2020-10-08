package com.yedam.morning;

public class MathRandom {
	public static void main(String[] args) {
		int ary[] = new int[10];

		for (int i = 0; i < ary.length; i++) {
			ary[i] = (int) (Math.random() * 10) + 1;
			for (int j = 0; j < i; j++) {
				if (ary[i] == ary[j]) {
					i--;
				}
			}
		}
		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i] + "");
		}

	}

} 
