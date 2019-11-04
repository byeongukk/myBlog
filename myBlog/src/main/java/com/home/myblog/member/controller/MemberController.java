package com.home.myblog.member.controller;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;
import javax.security.auth.login.LoginException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.home.myblog.common.ClientUtils;
import com.home.myblog.member.exception.AlreadyExistingEmailException;
import com.home.myblog.member.exception.AlreadyExistingIdException;
import com.home.myblog.member.model.service.MemberService;
import com.home.myblog.member.model.vo.JoinRequest;
import com.home.myblog.member.model.vo.LoginRequest;
import com.home.myblog.member.model.vo.Member;
import com.home.myblog.member.validator.MemberJoinValidator;
@SessionAttributes("loginMember")
@Controller
public class MemberController {
	
	@Autowired
	private MemberService ms;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	private static final Log LOG = LogFactory.getLog( MemberController.class);
	
	@RequestMapping("login.me")
	public String loginCheck(Member member,LoginRequest loginReq, HttpServletRequest request,Model model, HttpSession session) {
		
		System.out.println(ClientUtils.getRemoteIP(request));
		//로그인 시도 ip
		loginReq.setClIp(ClientUtils.getRemoteIP(request));
		//로그인 시도 id
		loginReq.setMllMid(member.getmId().toLowerCase());
		//user agent
		loginReq.setClUserAgent(request.getHeader("User-Agent"));
		//요청 URL
		loginReq.setClURL(request.getRequestURL().toString());
		
		System.out.println(loginReq);
		Member loginMember;
		// id는 소문자로만 검사
		member.setmId(member.getmId().toLowerCase());
		try {
			loginMember = ms.loginMember(member,loginReq);
			model.addAttribute("loginMember", loginMember);
			//session.setAttribute("loginMember", loginMember);
			return "redirect:index.jsp";
		} catch (LoginException e) {
			request.setAttribute("msg",e.getMessage());
			return "loginForm";
		}
	}
	@RequestMapping("logout.me")
	public String logout(SessionStatus status) {
		status.setComplete();
		
		return "redirect:index.jsp";
	}
	
	@RequestMapping("showJoinForm.me")
	public String showJoinForm(Model model,JoinRequest joinReq) {
		System.out.println(joinReq);
		model.addAttribute("joinReq",joinReq);
		return "joinForm";
	}
	
	
	@RequestMapping("showLoginForm.me")
	public String showLoginForm() {
		return "loginForm";
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
			//이메일 중복체크
			ms.duplicationCheckEmail(joinReq.getEmail());
		} catch (AlreadyExistingIdException e) {
			//아이디 중복시
			errors.rejectValue("mId","duplicate", e.getMessage());
			model.addAttribute("joinReq",joinReq);
			model.addAttribute("errors",errors);
			return "joinForm";
			
		} catch (AlreadyExistingEmailException e) {
			//이메일 중복시
			errors.rejectValue("email","duplicate", e.getMessage());
			model.addAttribute("joinReq",joinReq);
			model.addAttribute("errors",errors);
			return "joinForm";
		}
		//비밀번호 암호화 
		joinReq.setmPwd(passwordEncoder.encode(joinReq.getmPwd()));
		
		ms.joinMember(joinReq);
		
		//이메일 인증 보내기		
		try {
			ms.sendMail(joinReq);
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch ( MessagingException e2 ) {
			e2.printStackTrace();
		}
		
		model.addAttribute("msg","회원가입 성공");
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
		
	
	@RequestMapping("emailConfirm.me") 
	public String emailConfirm(Model model, HttpServletRequest request, String mId, String authkey) { 
		try {
			ms.emailConfirm(mId.toLowerCase(),authkey);
			model.addAttribute("msg", "이메일 인증이 완료되었습니다!\\n 회원가입한 아이디로 로그인 해주세요");
			return "common/alert"; 
		} catch(Exception e) {
			model.addAttribute("msg", e.getMessage()); 
			return "common/errorMsg"; 
		} 
	}
	 
	

}
