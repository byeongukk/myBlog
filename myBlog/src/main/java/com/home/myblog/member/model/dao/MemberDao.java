package com.home.myblog.member.model.dao;

import java.util.HashMap;

import javax.security.auth.login.LoginException;

import org.mybatis.spring.SqlSessionTemplate;

import com.home.myblog.member.exception.AlreadyExistingIdException;
import com.home.myblog.member.model.vo.JoinRequest;
import com.home.myblog.member.model.vo.Member;

public interface MemberDao {

	Member loginMember(SqlSessionTemplate sqlSession, Member member) throws LoginException;

	void duplicationCheckId(SqlSessionTemplate sqlSession, String mId) throws AlreadyExistingIdException;

	int joinMember(SqlSessionTemplate sqlSession, JoinRequest joinReq);

	String selectEncPassword(SqlSessionTemplate sqlSession, Member member);

	int updateEmailConfirm(SqlSessionTemplate sqlSession, String mid);

	void insertEmailCode(SqlSessionTemplate sqlSession, HashMap<String, Object> hmap);

	Member selectEmailCodeCheck(SqlSessionTemplate sqlSession, HashMap<String, Object> hmap);


}
