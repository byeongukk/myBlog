package com.home.myblog.board.model.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.home.myblog.board.model.vo.Board;

@Repository
public class BoardDaoImpl implements BoardDao {

	@Override
	public ArrayList<Board> selectBoardList(SqlSessionTemplate sqlSession, HashMap<String, Object> hmap) {
		return (ArrayList)sqlSession.selectList("Board.selectBoardList",hmap);
	}

	@Override
	public int insertBoard(SqlSessionTemplate sqlSession, HashMap<String, Object> hmap) {
		return sqlSession.insert("Board.insertBoard",hmap);
	}

	@Override
	public int getCommunityListCount(SqlSessionTemplate sqlSession, int bCode) {
		return sqlSession.selectOne("Board.selectCmListCount", bCode);
	}

	@Override
	public ArrayList<Board> selectBoardPagingList(SqlSessionTemplate sqlSession, HashMap<String, Object> hmap) {
		return (ArrayList)sqlSession.selectList("Board.selectBoardPagingList",hmap);
	}

}
