package com.yedam.Arrays;

public class Member implements Comparable<Member> {
	String name;
	int scores;

	Member(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Member o) {
		return this.name.compareTo(o.name);
	}

}
