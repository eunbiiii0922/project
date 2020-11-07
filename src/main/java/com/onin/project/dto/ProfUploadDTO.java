package com.onin.project.dto;

import lombok.Data;

@Data
public class ProfUploadDTO {
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getDbSaveName() {
		return dbSaveName;
	}
	public void setDbSaveName(String dbSaveName) {
		this.dbSaveName = dbSaveName;
	}
	int mno;
	String dbSaveName;
}
