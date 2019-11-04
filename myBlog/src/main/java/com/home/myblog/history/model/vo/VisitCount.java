package com.home.myblog.history.model.vo;

import com.home.myblog.common.ClientRequest;

public class VisitCount extends ClientRequest {
	private int visitId;
	
	public VisitCount() {}
	
	public VisitCount(int visitId) {
		super();
		this.visitId = visitId;
	}

	public int getVisitId() {
		return visitId;
	}

	public void setVisitId(int visitId) {
		this.visitId = visitId;
	}

	@Override
	public String toString() {
		return "VisitCount [visitId=" + visitId + ", getClDateTime()=" + getClDateTime() + ", getClIp()=" + getClIp()
				+ ", getClUserAgent()=" + getClUserAgent() + ", getClURL()=" + getClURL() + ", getReferer()="
				+ getReferer() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
}
