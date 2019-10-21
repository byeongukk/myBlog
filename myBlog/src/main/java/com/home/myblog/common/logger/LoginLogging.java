package com.home.myblog.common.logger;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.home.myblog.member.model.vo.Member;

@Component
@Aspect
public class LoginLogging {
	private static final Logger logger = LoggerFactory.getLogger(LoginLogging.class);
	
	@Pointcut("execution(* com.home.myblog..MemberServiceImpl.loginMember(..))")
	public void loginPointcut() {}
	
	//정상적으로 리턴값이 리턴됐을떄
	@AfterReturning(pointcut="loginPointcut()", returning = "returnObj")
	public void loginLog(JoinPoint jp, Object returnObj) {
		
		/*
		 * if(returnObj instanceof Member) { Member m = (Member) returnObj;
		 * System.out.println(new Date()+" : $"+m.getmId() +"$님이 로그인했습니다.");
		 * logger.info(new Date()+" : $"+m.getmId() +"$님이 로그인했습니다."); }
		 */
		
	}
	
}