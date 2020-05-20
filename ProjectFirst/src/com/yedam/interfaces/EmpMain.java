package com.yedam.interfaces;

import java.util.Scanner;

import com.yedam.database.EmpServiceImpl;

public class EmpMain {
	public static void main(String[] args) {
		// 1입력 2전체리스트 3수정 4삭제 5종료\
		EmpServiceImpl service = new EmpServiceImpl();
		Scanner scn = new Scanner(System.in);
		while (true) {
				System.out.println("===========================================");
				System.out.println("1.입력 2.전체리스트 3.수정  4.삭제 5.종료");
				System.out.println("===========================================");
				System.out.println("선택>");
			int menu = scn.nextInt();
			if (menu == 1) {
				try {
					System.out.println("사원번호 입력: ");
				} catch (Exception e) {
					System.out.println("잘못된 입력");
				}
				int empid = scn.nextInt();
				scn.nextLine();
				System.out.println("성 입력: ");
				String lastName = scn.nextLine();
				System.out.println("급여 입력: ");
				int salary = scn.nextInt();
				scn.nextLine();
				System.out.println("입사일 입력(2020/05/05) : ");
				String hireDate = scn.nextLine();

				Employee emp = new Employee(empid, lastName, salary, hireDate);
				service.createEmp(emp);

			} else if (menu == 2) {
				service.getEmpList();

			} else if (menu == 3) {
				System.out.println("변경 사원번호 입력");
				int empid = scn.nextInt();
				System.out.println("급여 입력");
				int salary = scn.nextInt();
				Employee emp = new Employee(empid, "", salary, "");
				service.changeEmp(emp);

			} else if (menu == 4) {
				System.out.println("삭제할 사원번호 입력");
				int empid = scn.nextInt();
				service.removeEmp(empid);
				

			} else if (menu == 5) {
				break;
			}
			System.out.println("프로그램 종료");
		}
	}
}