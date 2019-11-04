package com.home.myblog.admin.model.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.home.myblog.member.model.vo.LoginRequest;

@Repository
public class AdminDaoImpl implements AdminDao{

	@Override
	public ArrayList<LoginRequest> selectLoginLogList(SqlSessionTemplate sqlSession) {
		return (ArrayList)sqlSession.selectList("Admin.selectLoginLogList");
	}

}
