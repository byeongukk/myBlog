package com.home.myblog.common;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ClientRequest {
	@JsonFormat(pattern="yyyy-MMM-dd HH:mm:ss", timezone="Asia/Seoul")
	private Date clDateTime;	//요청시각
	private String clIp;		//요청IP
	private String clUserAgent; //요청 ua
	private String clURL;		//요청URL
	private String referer;		//이전URL

	public ClientRequest() {}

	public ClientRequest(Date clDateTime, String clIp, String clUserAgent, String clURL, String referer) {
		super();
		this.clDateTime = clDateTime;
		this.clIp = clIp;
		this.clUserAgent = clUserAgent;
		this.clURL = clURL;
		this.referer = referer;
	}

	public Date getClDateTime() {
		return clDateTime;
	}

	public void setClDateTime(Date clDateTime) {
		this.clDateTime = clDateTime;
	}

	public String getClIp() {
		return clIp;
	}

	public void setClIp(String clIp) {
		this.clIp = clIp;
	}

	public String getClUserAgent() {
		return clUserAgent;
	}

	public void setClUserAgent(String clUserAgent) {
		this.clUserAgent = clUserAgent;
	}

	public String getClURL() {
		return clURL;
	}

	public void setClURL(String clURL) {
		this.clURL = clURL;
	}

	public String getReferer() {
		return referer;
	}

	public void setReferer(String referer) {
		this.referer = referer;
	}

	@Override
	public String toString() {
		return "ClientRequest [clDateTime=" + clDateTime + ", clIp=" + clIp + ", clUserAgent=" + clUserAgent
				+ ", clURL=" + clURL + ", referer=" + referer + "]";
	}
	
	
	
}
