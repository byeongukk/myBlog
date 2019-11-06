package com.home.myblog.member.model.service;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;
import javax.security.auth.login.LoginException;

import com.home.myblog.member.exception.AlreadyExistingEmailException;
import com.home.myblog.member.exception.AlreadyExistingIdException;
import com.home.myblog.member.exception.EmailConfirmException;
import com.home.myblog.member.model.vo.JoinRequest;
import com.home.myblog.member.model.vo.LoginRequest;
import com.home.myblog.member.model.vo.Member;

public interface MemberService {
	
	public static final String PWD_NO_MATCH = "비밀번호 불일치";
	public static final String NO_ID = "아이디 없음";
	public static final String ID_OR_PWD_ERR_MSG = "아이디 혹은 비밀번호가 틀렸습니다";
	public static final String EMAIL_UNCERTIFIED = "이메일 미인증";
	public static final String EMAIL_UNCERTIFIED_MSG = "이메일 인증이 되지 않았습니다.이메일 인증후 다시 시도해주세요.";
	public static final String INVALID_REQUEST = "잘못된 요청입니다.";
	public static final String ALREADY_CERTIFIED = "이미 인증되었습니다.";

	Member loginMember(Member member, LoginRequest loginReq) throws LoginException;

	void duplicationCheckId(String mId) throws AlreadyExistingIdException;

	void joinMember(JoinRequest joinReq);

	void sendMail(JoinRequest joinReq) throws MessagingException, UnsupportedEncodingException;

	void emailConfirm(String mid, String authkey) throws EmailConfirmException;

	void duplicationCheckEmail(String email) throws AlreadyExistingEmailException;


}
