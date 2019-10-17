package com.home.myblog.member.model.dao;

import javax.security.auth.login.LoginException;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.home.myblog.member.model.vo.Member;

@Repository
public class MemberDaoImpl implements MemberDao{

	@Override
	public Member loginMember(SqlSessionTemplate sqlSession, Member member) throws LoginException {
		Member loginUser = sqlSession.selectOne("Member.loginCheck", member);
		if(loginUser == null) {
			throw new LoginException("로그인 정보가 없습니다.");			
		}
		return loginUser;
	}

}
