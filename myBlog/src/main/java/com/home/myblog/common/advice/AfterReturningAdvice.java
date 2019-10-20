package com.home.myblog.common.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AfterReturningAdvice {
  @Pointcut("execution(* com.home.myblog..*ServiceImpl.*(..))")
  public void allPointcut() {}
  
  @AfterReturning(pointcut="allPointcut()", returning="returnObj")
  public void afterLog(JoinPoint jp,Object returnObj) {
          //비즈니스 메소드가 리턴한 결과 데이터를 다른 용도로 처리할 때 사용한다.
		String methodName = jp.getSignature().getName();
		System.out.println("**************************************************");
		if(returnObj == null) {
			System.out.println("[메소드 리턴 ] : " + methodName + "() 메소드 리턴 값 : null");
		}else {
			System.out.println("[메소드 리턴 ] : " + methodName + "() 메소드 리턴 값 : " + returnObj.toString());
		}
		
		System.out.println("**************************************************");    
  }
}
