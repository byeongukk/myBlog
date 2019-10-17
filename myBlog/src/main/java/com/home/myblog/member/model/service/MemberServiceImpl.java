package com.home.myblog.member.model.service;

import javax.security.auth.login.LoginException;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.myblog.member.model.dao.MemberDao;
import com.home.myblog.member.model.vo.Member;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	private MemberDao md;
	
	@Override
	public Member loginMember(Member member) throws LoginException {
		return md.loginMember(sqlSession, member);
	}

	
}
