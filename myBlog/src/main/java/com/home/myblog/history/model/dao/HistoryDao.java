package com.home.myblog.history.model.dao;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;

import com.home.myblog.history.model.vo.VisitCount;

public interface HistoryDao {
	ArrayList<VisitCount> selectVisitLogList(SqlSessionTemplate sqlSession);



}
