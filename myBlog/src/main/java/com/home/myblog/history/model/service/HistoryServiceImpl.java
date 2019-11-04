package com.home.myblog.history.model.service;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.myblog.history.model.dao.HistoryDao;
import com.home.myblog.history.model.vo.VisitCount;

@Service
public class HistoryServiceImpl implements HistoryService{
	@Autowired
	private HistoryDao hd;

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public ArrayList<VisitCount> selectVisitLogList() {
		return hd.selectVisitLogList(sqlSession);
	}
	
	
}
