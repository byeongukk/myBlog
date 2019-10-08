package com.home.myblog.member.model.vo;

public class Member {

	private String mNo;
	private String mId;
	private String mPwd;
	private String email;
	private String emailCheck;
	private String mStatus;
	private String nickName;
	private String joinDate;
	
	public Member() {}

	public Member(String mNo, String mId, String mPwd, String email, String emailCheck, String mStatus, String nickName,
			String joinDate) {
		super();
		this.mNo = mNo;
		this.mId = mId;
		this.mPwd = mPwd;
		this.email = email;
		this.emailCheck = emailCheck;
		this.mStatus = mStatus;
		this.nickName = nickName;
		this.joinDate = joinDate;
	}

	public String getmNo() {
		return mNo;
	}

	public void setmNo(String mNo) {
		this.mNo = mNo;
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

	public String getmStatus() {
		return mStatus;
	}

	public void setmStatus(String mStatus) {
		this.mStatus = mStatus;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	@Override
	public String toString() {
		return "Member [mNo=" + mNo + ", mId=" + mId + ", mPwd=" + mPwd + ", email=" + email + ", emailCheck="
				+ emailCheck + ", mStatus=" + mStatus + ", nickName=" + nickName + ", joinDate=" + joinDate + "]";
	}
	
	
}
