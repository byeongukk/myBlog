package com.home.myblog.member.controller;

import javax.security.auth.login.LoginException;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.home.myblog.member.exception.AlreadyExistingIdException;
import com.home.myblog.member.model.service.MemberService;
import com.home.myblog.member.model.vo.JoinRequest;
import com.home.myblog.member.model.vo.Member;
import com.home.myblog.member.validator.MemberJoinValidator;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService ms;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	private static final Log LOG = LogFactory.getLog( MemberController.class);
	
	@RequestMapping("login.me")
	public String loginCheck(Member member,HttpServletRequest request) {

		Member loginMember;
		// id는 소문자로만 검사
		member.setmId(member.getmId().toLowerCase());
		try {
			loginMember = ms.loginMember(member);
			request.setAttribute("loginMember", loginMember);
			return "redirect:index.jsp";
		} catch (LoginException e) {
			request.setAttribute("msg",e.getMessage());
			return "loginForm";
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
		
		new MemberJoinValidator().validate(joinReq, errors);
		
		if(errors.hasErrors()) {
			model.addAttribute("joinReq",joinReq);
			model.addAttribute("errors",errors);
			return "joinForm";
		}
		
		//db에 저장될 아이디는 전체 소문자로
		joinReq.setmId(joinReq.getmId().toLowerCase());
		
		try {
			//아이디 중복 체크
			ms.duplicationCheckId(joinReq.getmId());
		} catch (AlreadyExistingIdException e) {
			errors.rejectValue("mId","duplicate", e.getMessage());
			model.addAttribute("joinReq",joinReq);
			model.addAttribute("errors",errors);
			return "joinForm";
		}
		//비밀번호 암호화 
		joinReq.setmPwd(passwordEncoder.encode(joinReq.getmPwd()));
		
		ms.joinMember(joinReq);
		return "redirect:index.jsp";
	}
	
	@RequestMapping("duplicationCheck.me")
	public String duplicationCheck(String mId,ModelAndView mv, JoinRequest joinReq, Errors errors) {
		
		try {
			ms.duplicationCheckId(mId);
		} catch (AlreadyExistingIdException e) {
			errors.rejectValue("mId","duplicate", e.getMessage());
		}
			
		return "joinForm";
	}
	
}
