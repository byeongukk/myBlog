package com.home.myblog.admin.model.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;

import com.home.myblog.member.model.vo.LoginRequest;

public interface AdminDao {

	ArrayList<LoginRequest> selectLoginLogList(SqlSessionTemplate sqlSession);

}
