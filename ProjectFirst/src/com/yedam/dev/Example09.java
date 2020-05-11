package com.yedam.dev;

import java.util.Scanner;

public class Example09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scn = new Scanner(System.in);

		while (run) {
			System.out.println("---------------------------------------");
			System.out.println("1.학생수 2.점수입력 3.점수리스트  4.분석 5.종료");
			System.out.println("---------------------------------------");
			System.out.println("선택> ");
			int selectNo = scn.nextInt();

			if (selectNo == 1) {
				System.out.print("학생수를 입력하세요. ");
				studentNum = scn.nextInt();
				scores = new int[studentNum];
				System.out.println("배열생성 되었습니다.");
			} else if (selectNo == 2) {
				int i = 0;
				for (int score : scores) {
					System.out.println("점수를 입력하세요.");
					score = scn.nextInt();
					scores[i++] = score;
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					int max = scores[i];
					if (max < scores[i]) {
						max = scores[i];
					}System.out.println("최고값은 : " + max);
					System.out.println("score[" + i + "]" + scores[i]);
				}
				
			} else if (selectNo == 4) {
				int sum = 0;
				for (int score : scores) {
					sum += score;
				}
				double avg = (double) sum / scores.length;
				System.out.println("합계는 : " + sum);
				System.out.println("평균은 : " + avg);
			} else if (selectNo == 5) {
				run = false;
				System.out.println("종료되었습니다.");
			}
		}
	}
}
