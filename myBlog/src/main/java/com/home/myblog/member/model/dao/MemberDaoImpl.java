package com.home.myblog.member.model.dao;

import java.util.HashMap;

import javax.security.auth.login.LoginException;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.home.myblog.member.exception.AlreadyExistingIdException;
import com.home.myblog.member.model.vo.JoinRequest;
import com.home.myblog.member.model.vo.Member;

@Repository
public class MemberDaoImpl implements MemberDao{

	@Override
	public Member loginMember(SqlSessionTemplate sqlSession, Member member) throws LoginException {
		return sqlSession.selectOne("Member.loginCheck", member);
	}

	@Override
	public void duplicationCheckId(SqlSessionTemplate sqlSession, String mId) throws AlreadyExistingIdException {
		String result = sqlSession.selectOne("Member.duplicationCheckId", mId);
		if(!(result == null)) {
			throw new AlreadyExistingIdException("이미 사용중인 아이디 입니다.");
		}
	}

	@Override
	public int joinMember(SqlSessionTemplate sqlSession, JoinRequest joinReq) {		
		return sqlSession.insert("Member.memberJoin", joinReq);
	}

	@Override
	public String selectEncPassword(SqlSessionTemplate sqlSession, Member member) {
		return sqlSession.selectOne("Member.selectEncPwd", member.getmId());
	}

	@Override
	public int updateEmailConfirm(SqlSessionTemplate sqlSession, String mid) {
		return sqlSession.update("Member.updateEmailConfirm",mid);
	}

	@Override
	public void insertEmailCode(SqlSessionTemplate sqlSession, HashMap<String, Object> hmap) {
		sqlSession.update("Member.insertEmailCode",hmap);
	}

	@Override
	public Member selectEmailCodeCheck(SqlSessionTemplate sqlSession, HashMap<String, Object> hmap) {
		return sqlSession.selectOne("Member.selectEmailCodeCheck", hmap);
	}



}
