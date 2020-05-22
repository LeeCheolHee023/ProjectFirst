package com.yedam.list;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.interfaces.Employee;

public class EmpDAO {

	Connection conn = null;
	PreparedStatement pstmt = null;

	public Connection getConnect() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, "hr", "hr");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;

	}

	public void insertEmp(Employee emp) {
		String sql = "insert into emp values(?,?,?,?)";
		conn = getConnect();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmployeeid());
			pstmt.setString(2, emp.getLastName());
			pstmt.setInt(3, emp.getSalary());
			pstmt.setString(4, emp.getHireDate());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 입력됨");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public List<Employee> getEmpList() {
		conn = getConnect();
		String sql = "select * from emp";
		List<Employee> employees = new ArrayList<>();
		int i = 0;

		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee(rs.getInt("employee_id"), rs.getString("last_name"), rs.getInt("salary"),
						rs.getString("hire_date"));
				employees.add(emp);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return employees;

	}

	public void updateEmp(Employee emp) throws SQLException {
		conn = getConnect();
		// 전제 조건 : 급여만 변경.
		String sql = "update emp set salary = ? where employee_id = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, emp.getSalary());
		pstmt.setInt(2, emp.getEmployeeid());
		int r = pstmt.executeUpdate();
		System.out.println(r + "건 변경됨.");

	}

	public void deleteEmp(int empId) {
		conn = getConnect();
		String sql = "delete from emp where employee_id = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empId);
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 삭제됨");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
