package com.home.myblog.history.model.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.home.myblog.history.model.vo.VisitCount;

@Repository
public class HistoryDaoImpl implements HistoryDao{

	@Override
	public ArrayList<VisitCount> selectVisitLogList(SqlSessionTemplate sqlSession) {
		return (ArrayList)sqlSession.selectList("History.selectVisitLogList");
	}



}
