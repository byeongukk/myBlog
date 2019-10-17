package com.home.myblog.member.model.vo;

import java.sql.Date;

public class Member implements java.io.Serializable{

	private int mNo;
	private String mId;
	private String mPwd;
	private String email;
	private String mStatus;
	private Date joinDate;
	
	public Member() {}

	public Member(int mNo, String mId, String mPwd, String email, String mStatus, Date joinDate) {
		super();
		this.mNo = mNo;
		this.mId = mId;
		this.mPwd = mPwd;
		this.email = email;
		this.mStatus = mStatus;
		this.joinDate = joinDate;
	}

	public int getmNo() {
		return mNo;
	}

	public void setmNo(int mNo) {
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

	public String getmStatus() {
		return mStatus;
	}

	public void setmStatus(String mStatus) {
		this.mStatus = mStatus;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	@Override
	public String toString() {
		return "Member [mNo=" + mNo + ", mId=" + mId + ", mPwd=" + mPwd + ", email=" + email + ", mStatus=" + mStatus
				+ ", joinDate=" + joinDate + "]";
	}


	
	
	
}
