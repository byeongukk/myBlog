package com.home.myblog.member.model.dao;

import javax.security.auth.login.LoginException;

import org.mybatis.spring.SqlSessionTemplate;

import com.home.myblog.member.model.vo.Member;

public interface MemberDao {

	Member loginMember(SqlSessionTemplate sqlSession, Member member) throws LoginException;

}
