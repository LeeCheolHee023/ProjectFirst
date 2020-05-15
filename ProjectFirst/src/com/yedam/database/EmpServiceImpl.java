package com.yedam.database;

public class EmpServiceImpl implements EmpService {
	EmpDAO dao = new EmpDAO();

	@Override
	public void createEmp(Employee emp) {
		dao.insertEmp(emp);

	}

	@Override
	public void getEmpList() {
		for (Employee emp : dao.getEmpList()) {
			System.out.println(emp.toString());
		}

	}

	@Override
	public void changeEmp(Employee emp) {

	}

	@Override
	public void removeEmp(int empId) {

	}

	public void createEmp(com.yedam.interfaces.Employee emp) {
		// TODO Auto-generated method stub
		
	}

	public void changeEmp(com.yedam.interfaces.Employee emp) {
		// TODO Auto-generated method stub
		
	}
}
