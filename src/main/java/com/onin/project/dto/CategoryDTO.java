package com.onin.project.dto;

import lombok.Data;

@Data
public class CategoryDTO {
	public int getLV() {
		return LV;
	}
	public void setLV(int lV) {
		LV = lV;
	}
	public int getCNO() {
		return CNO;
	}
	public void setCNO(int cNO) {
		CNO = cNO;
	}
	public int getCNOREF() {
		return CNOREF;
	}
	public void setCNOREF(int cNOREF) {
		CNOREF = cNOREF;
	}
	public String getCNAME() {
		return CNAME;
	}
	public void setCNAME(String cNAME) {
		CNAME = cNAME;
	}
	public String getCNAME_ENG() {
		return CNAME_ENG;
	}
	public void setCNAME_ENG(String cNAME_ENG) {
		CNAME_ENG = cNAME_ENG;
	}
	int LV;
	int CNO;
	int CNOREF;
	String CNAME;
	String CNAME_ENG;
	
}
