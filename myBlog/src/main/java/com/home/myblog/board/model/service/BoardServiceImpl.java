package com.home.myblog.board.model.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.myblog.board.model.dao.BoardDao;
import com.home.myblog.board.model.vo.Board;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardDao bd;
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public ArrayList<Board> selectBoardList(HashMap<String, Object> hmap) {
		return bd.selectBoardList(sqlSession, hmap);
	}

	@Override
	public void insertBoard(HashMap<String, Object> hmap) {
		int result = bd.insertBoard(sqlSession, hmap);
	}

	@Override
	public int getCommunityListCount(int bCode) {
		return bd.getCommunityListCount(sqlSession, bCode);
	}

	@Override
	public ArrayList<Board> selectBoardPagingList(HashMap<String, Object> hmap) {
		return bd.selectBoardPagingList(sqlSession, hmap);
	}
	
}
