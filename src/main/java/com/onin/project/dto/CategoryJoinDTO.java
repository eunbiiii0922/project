package com.onin.project.dto;

import lombok.Data;

@Data
public class CategoryJoinDTO {
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public int getCnoref() {
		return cnoref;
	}
	public void setCnoref(int cnoref) {
		this.cnoref = cnoref;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCname_eng() {
		return cname_eng;
	}
	public void setCname_eng(String cname_eng) {
		this.cname_eng = cname_eng;
	}
	public int getDcno() {
		return dcno;
	}
	public void setDcno(int dcno) {
		this.dcno = dcno;
	}
	public String getDcname() {
		return dcname;
	}
	public void setDcname(String dcname) {
		this.dcname = dcname;
	}
	int cno;
	int cnoref;
	String cname;
	String cname_eng;
	int dcno;
	String dcname;
}
