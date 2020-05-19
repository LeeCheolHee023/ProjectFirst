package com.yedam.api;

public class Member {

	public String id;
	public Member() {
	}
	
	public Member(String id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		
		return id.hashCode();
//		return super.hashCode();
			
	}
	@Override
	public boolean equals(Object obj) {
		Member m = (Member) obj;
		return this.id.equals(m.id);
//		return super.equals(obj);
	}
	@Override
	public java.lang.String toString() {
		return "id값은 "  + this.id; 
//		return super.toString();
	}
}
