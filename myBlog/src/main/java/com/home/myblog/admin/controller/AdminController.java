package com.home.myblog.admin.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.home.myblog.admin.model.service.AdminService;
import com.home.myblog.member.model.vo.LoginRequest;

@Controller
public class AdminController {

	@Autowired
	private AdminService as;
	
	@RequestMapping("showAdminMain.ad")
	public String showAdminMain() {	
		return "admin/adminMain";
	}
	@RequestMapping("showLoginLogList.ad")
	public String showLoginLogList() {
		return "admin/ad-loginLogList";
	}
	
	@RequestMapping("selectLoginLogList.ad")
	@ResponseBody
	public Map<String,Object> selectLoginLogList(HttpServletRequest request,ModelAndView mv) {
		ArrayList<LoginRequest> loginList =  as.selectLoginLogList();
		mv.addObject("loginList",loginList);
		
		Map<String,Object> result = new HashMap<String,Object>();
		System.out.println(loginList.get(0).getClDateTime());
		
		result.put("loginList", loginList);

		

		return result;
	}
			
}
