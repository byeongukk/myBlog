package com.home.myblog.admin.model.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.myblog.admin.model.dao.AdminDao;
import com.home.myblog.member.model.vo.LoginRequest;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	private AdminDao ad;
	
	@Override
	public ArrayList<LoginRequest> selectLoginLogList() {
		return ad.selectLoginLogList(sqlSession);
	}

}
