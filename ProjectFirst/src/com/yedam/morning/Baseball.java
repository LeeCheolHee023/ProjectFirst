package com.yedam.morning;

import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		int com[] = new int[3];
		int user[] = new int[3];
		boolean baseball = true;
		Scanner scn = new Scanner(System.in);
		int strike = 0;
		int ball = 0;
		int counter = 0;

		while (baseball) {
			for (int i = 0; i < com.length; i++) {
				com[i] = (int) (Math.random() * 10);
			}
			if (com[0] != com[1] && com[1] != com[2] && com[0] != com[2]) {
			}
			baseball = false;
		}
		baseball = true;

		System.out.println("======게임시작======");
		while (baseball) {
			strike = 0;
			ball = 0;
			int user1 = 0;
			System.out.println("이겨보자");
			String a = scn.nextLine();

			for (int i = 0; i < user.length; i++) {
				user[i] = user1;
				try {
					if (0 < user1 || user1 < 10) {
						System.out.println("숫자를 입력하세요");
						scn.nextInt();
					} else {
						System.out.println("잘못 입력하셨습니다.");
					}
				} catch (Exception e) {
				}
			}
			for (int i = 0; i < com.length; i++) {
				for (int j = 0; j < user.length; j++) {
					if (com[i] == user[j] && i == j) {
						strike++;
					} else if (com[i] == user[j] && i != j) {
						ball++;
					}
				}
			}
			System.out.println(strike + "스트라이크" + ball + "볼");
			if (strike == 3) {
				baseball = false;
			}

			counter++;
		}
		System.out.println("게임끝");
	}
}
