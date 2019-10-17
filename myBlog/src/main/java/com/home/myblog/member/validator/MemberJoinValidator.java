package com.home.myblog.member.validator;

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
	
	private Pattern pattern;
	
	public MemberJoinValidator() {
		pattern = Pattern.compile(emailRegExp);
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
			errors.rejectValue("mId", "lengthsize","아이디는 4~10자리 사이로 작성해주세요");
		}
		
		if(joinReq.getEmail() == null || joinReq.getEmail().trim().isEmpty()) {
			errors.rejectValue("email", "required", "필수 항목 입니다.");
		}
		
		ValidationUtils.rejectIfEmpty(errors, "mPwd", "required", "필수 항목 입니다");
		ValidationUtils.rejectIfEmpty(errors, "mPwdCheck", "required", "필수 항목 입니다");
		ValidationUtils.rejectIfEmpty(errors, "mId", "required", "필수 항목 입니다");
		
		if(!joinReq.getmPwd().isEmpty()) {
			if(!joinReq.isPwdEqualToCheckPwd()) {
				errors.rejectValue("mPwdCheck", "nomatch", "비밀번호가 일치하지 않습니다");
			}
		}
		
	}

}
