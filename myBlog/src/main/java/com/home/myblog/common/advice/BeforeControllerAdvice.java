package com.home.myblog.common.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BeforeControllerAdvice {
	
	@Pointcut("execution(* com.home.myblog..*Controller.*(..))")
	public void allPointcut() {}
	
	@Before("allPointcut()")
	public void beforeLog(JoinPoint jp) {
		System.out.println("*********Controller 호출**********");
		
		
		String methodName = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		
		System.out.println("[메소드 호출 전 확인 ] : " + methodName + "() 메소드 매개변수 갯수 : " + args.length);
		
		int argsLength = args.length;
		
		for(int i=0; i < argsLength; i++) {
			System.out.println(i + "번째 매개변수 정보 : " + args[i].toString());
			System.out.println(i + "번째 매개변수 클레스 : " + args[i].getClass());
		}
		
		System.out.println("*********Controller 호출끝**********");
	}
}
