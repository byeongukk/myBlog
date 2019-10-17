package com.home.myblog.member.model.service;

import javax.security.auth.login.LoginException;

import com.home.myblog.member.model.vo.Member;

public interface MemberService {

	Member loginMember(Member member) throws LoginException;

}
