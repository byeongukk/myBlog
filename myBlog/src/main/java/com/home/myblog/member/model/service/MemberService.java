package com.home.myblog.member.model.service;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;
import javax.security.auth.login.LoginException;

import com.home.myblog.member.exception.AlreadyExistingIdException;
import com.home.myblog.member.exception.EmailConfirmException;
import com.home.myblog.member.model.vo.JoinRequest;
import com.home.myblog.member.model.vo.Member;

public interface MemberService {

	Member loginMember(Member member) throws LoginException;

	void duplicationCheckId(String mId) throws AlreadyExistingIdException;

	void joinMember(JoinRequest joinReq);

	void sendMail(JoinRequest joinReq) throws MessagingException, UnsupportedEncodingException;

	void emailConfirm(String mid, String authkey) throws EmailConfirmException;

}
