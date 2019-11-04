package com.home.myblog.history.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.home.myblog.history.model.vo.VisitCount;

@Repository
public class VisitCountDao{

	@Autowired
	private SqlSessionTemplate sqlSession;

	public int insertVisitor(VisitCount vc) {
		return sqlSession.insert("insertVisitor",vc);
	}

	public int getVisitTodayCount() {
		return sqlSession.selectOne("getVisitTodayCount");
	}

	public int getVisitTotalCount() {
		return sqlSession.selectOne("getVisitTotalCount");
	}

}
