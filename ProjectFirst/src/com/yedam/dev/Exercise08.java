package com.yedam.dev;

public class Exercise08 {
	public static void main(String[] args) {
		int[][] array = new int[3][5];
		array[0] = new int[] { 95, 86 };
		array[1] = new int[] { 83, 82, 96 };
		array[2] = new int[] { 78, 83, 93, 87, 88 };
		
		
		int sum = 0;
		int cnt = 0;
		double avg = 0.0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
			cnt += array[i].length;
			avg = (double) sum / cnt;
		}
		System.out.println("합 : " + sum);
		System.out.println("평균 : " + avg);
	}
}
