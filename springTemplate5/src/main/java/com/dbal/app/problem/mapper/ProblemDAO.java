package com.dbal.app.problem.mapper;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dbal.app.problem.ProblemVO;

@Repository
public class ProblemDAO {
	@Autowired private SqlSessionTemplate mybatis;
	
	public ProblemVO getPro(ProblemVO problemVO) {
		return mybatis.selectOne("com.dbal.app.problem.mapper.ProblemDAO.getPro",problemVO);
	}
	public void insertPro(ProblemVO problemVO) {
		 mybatis.insert("com.dbal.app.problem.mapper.ProblemDAO.insertPro", problemVO);
	}
}
