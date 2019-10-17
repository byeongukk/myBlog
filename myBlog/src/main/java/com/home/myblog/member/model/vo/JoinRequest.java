package com.home.myblog.member.model.vo;

import java.sql.Date;

public class JoinRequest implements java.io.Serializable{

	private String mId;
	private String mPwd;
	private String mPwdCheck;
	private String email;
	private String emailCheck;
	
	public JoinRequest() {}

	public JoinRequest(String mId, String mPwd, String mPwdCheck, String email, String emailCheck) {
		super();
		this.mId = mId;
		this.mPwd = mPwd;
		this.mPwdCheck = mPwdCheck;
		this.email = email;
		this.emailCheck = emailCheck;
	}
	public boolean isPwdEqualToCheckPwd() {
		return mPwd.equals(mPwdCheck);
	}

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getmPwd() {
		return mPwd;
	}

	public void setmPwd(String mPwd) {
		this.mPwd = mPwd;
	}

	public String getmPwdCheck() {
		return mPwdCheck;
	}

	public void setmPwdCheck(String mPwdCheck) {
		this.mPwdCheck = mPwdCheck;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailCheck() {
		return emailCheck;
	}

	public void setEmailCheck(String emailCheck) {
		this.emailCheck = emailCheck;
	}

	@Override
	public String toString() {
		return "JoinRequest [mId=" + mId + ", mPwd=" + mPwd + ", mPwdCheck=" + mPwdCheck + ", email=" + email
				+ ", emailCheck=" + emailCheck + "]";
	}
	
	

}
