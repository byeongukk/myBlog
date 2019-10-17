package com.home.myblog.member.controller;

import javax.security.auth.login.LoginException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;

import com.home.myblog.member.model.service.MemberService;
import com.home.myblog.member.model.vo.JoinRequest;
import com.home.myblog.member.model.vo.Member;
import com.home.myblog.member.validator.MemberJoinValidator;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService ms;
	
	
	@RequestMapping("login.me")
	public String loginCheck(Member member,HttpServletRequest request) {

		Member loginMember;
		
		try {
			loginMember = ms.loginMember(member);
			request.setAttribute("loginMember", loginMember);
			return "redirect:index.jsp";
		} catch (LoginException e) {
			request.setAttribute("msg",e.getMessage());
			return "common/errorPage";
		}
	}
	
	@RequestMapping("showJoinForm.me")
	public String showJoinForm(Model model,JoinRequest joinReq) {
		System.out.println(joinReq);
		model.addAttribute("joinReq",joinReq);
		return "joinForm";
	}
	
	@RequestMapping("join.me")
	public String joinMember(HttpServletRequest request,Model model, JoinRequest joinReq, Errors errors) {
		System.out.println(joinReq);
		
		new MemberJoinValidator().validate(joinReq, errors);
		
		if(errors.hasErrors()) {
			model.addAttribute("joinReq",joinReq);
			model.addAttribute("errors",errors);
			return "joinForm";
		}else {
			return "redirect:index.jsp";
		}
	}
	
}
