package com.home.myblog.member.model.vo;

import java.sql.Date;

import com.home.myblog.common.ClientRequest;

public class LoginRequest extends ClientRequest{

//	상속받은 필드
//	private Date clDateTime;	//요청시각
//	private String clIp;		//요청IP
//	private String clUserAgent; //요청 ua
//	private String clURL;		//요청URL
//	private String referer;		//이전URL
	
	
	private int mllId;
	private String mllSuccess;
	private int mNo;
	private String mllMid;
	private String mllReason;
	
	public LoginRequest() {}

	public LoginRequest(int mllId, String mllSuccess, int mNo, String mllMid, String mllReason) {
		super();
		this.mllId = mllId;
		this.mllSuccess = mllSuccess;
		this.mNo = mNo;
		this.mllMid = mllMid;
		this.mllReason = mllReason;
	}

	public int getMllId() {
		return mllId;
	}

	public void setMllId(int mllId) {
		this.mllId = mllId;
	}

	public String getMllSuccess() {
		return mllSuccess;
	}

	public void setMllSuccess(String mllSuccess) {
		this.mllSuccess = mllSuccess;
	}

	public int getmNo() {
		return mNo;
	}

	public void setmNo(int mNo) {
		this.mNo = mNo;
	}

	public String getMllMid() {
		return mllMid;
	}

	public void setMllMid(String mllMid) {
		this.mllMid = mllMid;
	}

	public String getMllReason() {
		return mllReason;
	}

	public void setMllReason(String mllReason) {
		this.mllReason = mllReason;
	}

	@Override
	public String toString() {
		return "LoginRequest [mllId=" + mllId + ", mllSuccess=" + mllSuccess + ", mNo=" + mNo + ", mllMid=" + mllMid
				+ ", mllReason=" + mllReason + "]";
	}

	
	
	
	
}
