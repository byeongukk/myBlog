package com.home.myblog.board.model.vo;

import java.sql.Date;

public class Board implements java.io.Serializable {
	private int bNo;
	private String bTitle;
	private String bContent;
	private Date WritenDate;
	private int bCount;
	private String bWriter;
	private int bCode;
	private String bStatus;
	
	public Board() {
		
	}

	public Board(int bNo, String bTitle, String bContent, Date writenDate, int bCount, String bWriter, int bCode,
			String bStatus) {
		super();
		this.bNo = bNo;
		this.bTitle = bTitle;
		this.bContent = bContent;
		WritenDate = writenDate;
		this.bCount = bCount;
		this.bWriter = bWriter;
		this.bCode = bCode;
		this.bStatus = bStatus;
	}

	public int getbNo() {
		return bNo;
	}

	public void setbNo(int bNo) {
		this.bNo = bNo;
	}

	public String getbTitle() {
		return bTitle;
	}

	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}

	public String getbContent() {
		return bContent;
	}

	public void setbContent(String bContent) {
		this.bContent = bContent;
	}

	public Date getWritenDate() {
		return WritenDate;
	}

	public void setWritenDate(Date writenDate) {
		WritenDate = writenDate;
	}

	public int getbCount() {
		return bCount;
	}

	public void setbCount(int bCount) {
		this.bCount = bCount;
	}

	public String getbWriter() {
		return bWriter;
	}

	public void setbWriter(String bWriter) {
		this.bWriter = bWriter;
	}

	public int getbCode() {
		return bCode;
	}

	public void setbCode(int bCode) {
		this.bCode = bCode;
	}

	public String getbStatus() {
		return bStatus;
	}

	public void setbStatus(String bStatus) {
		this.bStatus = bStatus;
	}

	@Override
	public String toString() {
		return "Board [bNo=" + bNo + ", bTitle=" + bTitle + ", bContent=" + bContent + ", WritenDate=" + WritenDate
				+ ", bCount=" + bCount + ", bWriter=" + bWriter + ", bCode=" + bCode + ", bStatus=" + bStatus + "]";
	}


	
}
