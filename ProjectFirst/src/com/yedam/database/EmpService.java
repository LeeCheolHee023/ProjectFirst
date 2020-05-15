package com.yedam.database;

	public interface EmpService {
		//기능 정의 , 구현은 안함
		//한건 생성
		public void createEmp(Employee emp); // public abstract void create
		//전체 조회
		public void getEmpList();
		//한건수정
		public void changeEmp(Employee emp);
		//한건삭제
		public void removeEmp(int empId);
	}


