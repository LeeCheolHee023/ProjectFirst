package com.yedam.classes.inherit;

import java.util.Scanner;

import com.yedam.classes.Account;

public class Adress extends Friends {
	private Scanner scn = new Scanner(System.in);
	private Adress[] ads = new Adress[10];

	public void Friends() {
		System.out.println("주소입력.");
		System.out.println("1.친구 2.학교 3.회사");
		scn.hasNextLine();
		System.out.println("이름을 입력하세요.");
		String name = scn.nextLine();scn.hasNextLine();
		System.out.println("전화번호를 입력하세요.");
		String num = scn.nextLine();scn.hasNextLine();
		Adress acnt = new Adress();
		
	}
	public void Unv() {
		System.out.println("친구목폭.");
		System.out.println("이름을 입력하세요.");
		String name = scn.nextLine();
		System.out.println("전화번호를 입력하세요.");
		String num = scn.nextLine();
		System.out.println("전공을 입력하세요.");
		String major = scn.nextLine();
		Adress acnt = new Adress();
	}
	public void Company() {
		System.out.println("친구목폭.");
		System.out.println("이름을 입력하세요.");
		String name = scn.nextLine();
		System.out.println("전화번호를 입력하세요.");
		String num = scn.nextLine();
		System.out.println("부서를 입력하세요.");
		String emp = scn.nextLine();
		Adress acnt = new Adress();
	}
	private void list() {
		System.out.println("주소목록 선택."); // 전체 배열중에 값이 있는 경우에만 출력(null 제외)
		for (Account acc : acconuts) {
			if (acc != null) { // null 제외
				System.out.println("이름 : " + acc.getName() + ",예금주 : " + acc.getNum() + ",잔액 : " + acc.getBalance());
			}
		}
	public void execute() {
		while (true) {
			System.out.println("----------------------------------");
			System.out.println("1.주소입력 2.주소목록 3.이름조회 4.종료");
			System.out.println("----------------------------------");
			System.out.println("선택> ");
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {
				Friends();
			} else if (menu == 2) {
				list();
			} else if (menu == 3) {
				Company();
			}else if(menu==4) {
			   break;
			}
		}System.out.println("프로그램 종료");
	}
}
