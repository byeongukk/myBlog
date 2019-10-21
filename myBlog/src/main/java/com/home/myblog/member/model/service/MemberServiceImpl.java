package com.home.myblog.member.model.service;

import java.util.Date;

import javax.security.auth.login.LoginException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.home.myblog.member.controller.MemberController;
import com.home.myblog.member.exception.AlreadyExistingIdException;
import com.home.myblog.member.model.dao.MemberDao;
import com.home.myblog.member.model.vo.JoinRequest;
import com.home.myblog.member.model.vo.Member;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	private MemberDao md;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	private static final Log LOG = LogFactory.getLog( MemberController.class);
	
	
	@Override
	public Member loginMember(Member member) throws LoginException {
		
		Member loginMember = null;
		
		String encPassword = md.selectEncPassword(sqlSession, member);
		if(!passwordEncoder.matches(member.getmPwd(), encPassword)) {
			throw new LoginException("아이디 혹은 비밀번호가 틀렸습니다");
		}else {
			member.setmPwd(encPassword);
			loginMember = md.loginMember(sqlSession, member);
			LOG.info(new Date() + " : $"+ loginMember.getmId()+"$님이 로그인 했습니다..");
		}
		return loginMember;
	}

	@Override
	public void duplicationCheckId(String mId) throws AlreadyExistingIdException {
		md.duplicationCheckId(sqlSession,mId);
	}

	@Override
	public void joinMember(JoinRequest joinReq) {
		int result = md.joinMember(sqlSession, joinReq);
		LOG.info(new Date() + " : $"+ joinReq.getmId()+"$님이 회원가입 했습니다.");
	}
	


	
}
