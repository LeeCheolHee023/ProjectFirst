package com.yedam.Collection.list;

import java.util.List;

public interface BoardService {
	void insertBoard(List<Board> list, Board board); //입력
	void updateBoard(List<Board> list, Board board); //수정
	void deleteBoard(List<Board> list, String title); //삭제
	void BoardList(List<Board> list);
}
