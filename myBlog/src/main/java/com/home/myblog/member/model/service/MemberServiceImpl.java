package com.home.myblog.member.model.service;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;

import javax.mail.MessagingException;
import javax.security.auth.login.LoginException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.home.myblog.common.MailHandler;
import com.home.myblog.common.Tempkey;
import com.home.myblog.member.controller.MemberController;
import com.home.myblog.member.exception.AlreadyExistingEmailException;
import com.home.myblog.member.exception.AlreadyExistingIdException;
import com.home.myblog.member.exception.EmailConfirmException;
import com.home.myblog.member.model.dao.MemberDao;
import com.home.myblog.member.model.vo.JoinRequest;
import com.home.myblog.member.model.vo.Member;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	private JavaMailSender mailSender;
	
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
		}
		
		//이메일 인증 여부 체크
		if(loginMember.geteCheck().equals("N") || loginMember.geteCheck() == null) {
			throw new LoginException("이메일 인증이 되지 않았습니다.이메일 인증후 다시 시도해주세요.");
		}
		
		LOG.info(new Date() + " : $"+ loginMember.getmId()+"$님이 로그인 했습니다..");
	
		
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

	@Override
	public void sendMail(JoinRequest joinReq) throws MessagingException, UnsupportedEncodingException {
		String authkey = new Tempkey().getKey(50,false);
		HashMap<String,Object> hmap = new HashMap();
		hmap.put("authkey", authkey);
		hmap.put("mId",joinReq.getmId());
		
		md.insertEmailCode(sqlSession,hmap);
		MailHandler sendMail = new MailHandler(mailSender);
		sendMail.setSubject("[uk's blog] / 회원가입 이메일 인증");
		sendMail.setText(new StringBuffer().append("<h1>[uk's blog에 어서오세요!]</h1>")
				.append("<p>아래 링크를 클릭하시면 이메일 인증이 완료됩니다.</p>")
				.append("<a href='http://localhost:8001/emailConfirm.me?mId=")
				.append(joinReq.getmId())
				.append("&email=")
				.append(joinReq.getEmail())
				.append("&authkey=")
				.append(authkey)
				.append("' target='_blank'>이메일 인증 확인</a>")
				.toString());
		sendMail.setFrom("programmeruk92@gmail.com ", "uk's blog");
		sendMail.setTo(joinReq.getEmail());
		sendMail.send();
		
	}

	@Override
	public void emailConfirm(String mid,String authkey) throws EmailConfirmException {
		int result = 0;
		HashMap<String,Object> hmap = new HashMap();
		hmap.put("mId", mid.toLowerCase());
		hmap.put("authkey",authkey);
		Member member = md.selectEmailCodeCheck(sqlSession,hmap);
		
		if(member != null) {
			result = md.updateEmailConfirm(sqlSession, mid);
		}else {
			throw new EmailConfirmException("잘못된 요청입니다");
		}
		
		if(result <= 0 ) {
			throw new EmailConfirmException("이미 인증되었습니다.");
		}
	}

	@Override
	public void duplicationCheckEmail(String email) throws AlreadyExistingEmailException {
		md.duplicationCheckEmail(sqlSession,email);
	}
	


	
}
