package com.yedam.Collection.list;

import java.util.ArrayList;
import java.util.List;

public class BoardServiceImpl2 implements BoardService2 {
	List<Board> list = new ArrayList<>();

	@Override
	public void insertBoard(Board board) {
		list.add(board);
	}

	@Override
	public void updateBoard(Board board) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(board.getTitle())) {
				list.get(i).setcontent(board.getcontent());
			}
		}

	}

	@Override
	public void deleteBoard(String title) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				list.remove(i);
			}
		}
	}

	@Override
	public void BoardList() {
		for (Board board : list) {
			System.out.println(board.toString());
		}

	}
}

