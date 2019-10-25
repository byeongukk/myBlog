package com.home.myblog.board.model.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;

import com.home.myblog.board.model.vo.Board;

public interface BoardDao {

	ArrayList<Board> selectBoardList(SqlSessionTemplate sqlSession, HashMap<String, Object> hmap);

	int insertBoard(SqlSessionTemplate sqlSession, HashMap<String, Object> hmap);

}
