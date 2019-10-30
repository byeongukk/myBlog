package com.home.myblog.board.model.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.home.myblog.board.model.vo.Board;

public interface BoardService {

	ArrayList<Board> selectBoardList(HashMap<String, Object> hmap);

	void insertBoard(HashMap<String, Object> hmap);

	int getCommunityListCount(int bCode);

	ArrayList<Board> selectBoardPagingList(HashMap<String, Object> hmap);

}
