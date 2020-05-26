package com.yedam.Collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Freeboard2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		

		BoardService2 service = new BoardServiceImpl2();
		while (true) {
			System.out.println("===========================================");
			System.out.println("1.입력 2.전체리스트 3.수정  4.삭제 5.종료");
			System.out.println("===========================================");
			System.out.print("선택>");
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {
				System.out.println("제목입력");
				String title = scn.nextLine();
				System.out.println("내용입력");
				String content = scn.nextLine();
				System.out.println("작성자입력");
				String writer = scn.nextLine();
				Board brd = new Board(title, content, writer);
				service.insertBoard(brd);

			} else if (menu == 2) {
				service.BoardList();

			} else if (menu == 3) {
				System.out.println("제목입력");
				String title = scn.nextLine();
				System.out.println("변경내용 입력");
				String content = scn.nextLine();
				Board brd = new Board(title, content, null);
				service.updateBoard(brd);

			} else if (menu == 4) {
				System.out.println("제목입력");
				String title = scn.nextLine();
				service.deleteBoard(title);

			} else if (menu == 5) {
				break;
			}
		}
		System.out.println("end of prog");
	}

}
