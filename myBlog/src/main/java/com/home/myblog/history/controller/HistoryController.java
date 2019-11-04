package com.home.myblog.history.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.home.myblog.history.model.service.HistoryService;
import com.home.myblog.history.model.vo.VisitCount;

@Controller
public class HistoryController {
	
	@Autowired
	private HistoryService hs;
	
	@RequestMapping("showVisitLogList.hs")
	public String showVisitLogList() {
		return "admin/ad-visitLogList";
	}
	
	@RequestMapping("selectVisitLogList.ad")
	@ResponseBody
	public Map<String,Object> selectVisitLogList(HttpServletRequest request,ModelAndView mv) {
		ArrayList<VisitCount> visitList =  hs.selectVisitLogList();
		mv.addObject("visitList",visitList);
		
		Map<String,Object> result = new HashMap<String,Object>();
		
		result.put("visitList", visitList);

		

		return result;
	}
	
}
