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
		System.out.println("*********Controller ȣ��**********");
		
		
		String methodName = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		
		System.out.println("[�޼ҵ� ȣ�� �� Ȯ�� ] : " + methodName + "() �޼ҵ� �Ű����� ���� : " + args.length);
		
		int argsLength = args.length;
		
		for(int i=0; i < argsLength; i++) {
			System.out.println(i + "��° �Ű����� ���� : " + args[i].toString());
			System.out.println(i + "��° �Ű����� Ŭ���� : " + args[i].getClass());
		}
		
		System.out.println("*********Controller ȣ�ⳡ**********");
	}
}
