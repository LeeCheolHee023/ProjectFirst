package com.yedam.Collection.list;

public class Board {
	private String writer; 
	private String content;
	private String title;

	public Board(String title, String content, String writer) {
		this.content = content;
		this.writer = writer;
		this.title = title;

	}

	public String getwriter() {
		return writer;
	}

	public void setwriter(String writer) {
		this.writer = writer;
	}

	public String getcontent() {
		return content;
	}

	public void setcontent(String content) {
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {

		return title + ", " + content + ", " + writer;
	}

}
