package com.home.myblog.board.controller;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.home.myblog.board.model.service.BoardService;
import com.home.myblog.board.model.vo.Board;
import com.home.myblog.common.PagingVo;
import com.home.myblog.member.model.vo.Member;

@Controller
public class BoardController {

	@Autowired
	private BoardService bs;
	
	
	@RequestMapping("selectCommunityList.bo")
	public String selectCommunityList(HttpServletRequest request,PagingVo pi, Board board, Model model) {
		HashMap<String,Object> hmap = new HashMap();
		int bCode = 100;
		System.out.println(pi);
		hmap.put("pi", pi);
		hmap.put("bCode", bCode);
		
		//ArrayList<Board> list = bs.selectBoardList(hmap);
		ArrayList<Board> list = bs.selectBoardPagingList(hmap);
		
		//페이징 겟수 조회
		pi.setTotal(bs.getCommunityListCount(bCode));
		System.out.println(pi.getStart());
		System.out.println(pi.getLast());
		model.addAttribute("list",list);
		model.addAttribute("pi",pi);
		return "community";
	}
	@RequestMapping("insertBoard.bo")
	public String selectBoard(HttpServletRequest request, Board board, Model model, HttpSession session) {
		HashMap<String,Object > hmap = new HashMap();
		
		Member member = (Member) session.getAttribute("loginMember");
		hmap.put("member", member);
		hmap.put("board", board);
		
		bs.insertBoard(hmap);
		
		
		return "redirect:selectCommunityList.bo";
	}
}
