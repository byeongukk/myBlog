package com.home.myblog.member.exception;

public class AlreadyExistingEmailException extends Exception{
	
	public AlreadyExistingEmailException(String msg) {
		super(msg);
	}
}
