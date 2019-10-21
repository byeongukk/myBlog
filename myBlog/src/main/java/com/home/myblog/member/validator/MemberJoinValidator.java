package com.home.myblog.member.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.home.myblog.member.model.vo.JoinRequest;

public class MemberJoinValidator implements Validator {

	//이메일 정규표현식
	private static final String emailRegExp =
		"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
		"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	//id 정규표현식 , 영문으로 시작, 길이 4~15자 사이
	private static final String idRegExp =
			"[A-Za-z]{1}[A-Za-z0-9]{4,15}$";
	
	private Pattern emailPattern;
	private Pattern idPattern;
	
	public MemberJoinValidator() {
		emailPattern = Pattern.compile(emailRegExp);
		idPattern = Pattern.compile(idRegExp);
	}
	
	@Override
	public boolean supports(Class<?> clazz) {
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		JoinRequest joinReq = (JoinRequest) target;
		
		int idLength = joinReq.getmId().length();
		
		if(idLength < 4 || idLength > 10) {
			errors.rejectValue("mId", "lengthsize","아이디는 4~15자리 사이로 작성해주세요");
		}
		
		int pwdLength = joinReq.getmPwd().length();
		
		if(pwdLength < 8 || pwdLength > 20) {
			errors.rejectValue("mPwd", "lengthsize","비밀번호는 8~20자리 사이로 입력해주세요");
		}
		
		if(joinReq.getEmail() == null || joinReq.getEmail().trim().isEmpty()) {
			errors.rejectValue("email", "required", "필수 항목 입니다.");
		}
		
		//아이디 정규표현식 검사
		if(joinReq.getmId() == null || joinReq.getmId().trim().isEmpty()) {
			errors.rejectValue("mId", "required", "아이디는 필수 항목입니다.");
		}else {
			Matcher matcher = idPattern.matcher(joinReq.getmId());
			if(!matcher.matches()) {
				errors.rejectValue("mId","bad","아이디는 영문 및 영문+숫자만 사용 가능합니다");
			}
		}
		
		ValidationUtils.rejectIfEmpty(errors, "mPwd", "required", "비밀번호를 입력해주세요");
		ValidationUtils.rejectIfEmpty(errors, "mPwdCheck", "required", "비밀번호 확인을 입력해주세요");

		if(!joinReq.getmPwd().isEmpty()) {
			if(!joinReq.isPwdEqualToCheckPwd()) {
				errors.rejectValue("mPwdCheck", "nomatch", "비밀번호가 일치하지 않습니다");
			}
		}
		
	}

}
