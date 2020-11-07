package com.onin.project.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class InvoiceDTO {
	
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
	public String getQ1() {
		return q1;
	}
	public void setQ1(String q1) {
		this.q1 = q1;
	}
	public String getQ2() {
		return q2;
	}
	public void setQ2(String q2) {
		this.q2 = q2;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public Date getInvoice_date() {
		return invoice_date;
	}
	public void setInvoice_date(Date invoice_date) {
		this.invoice_date = invoice_date;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getFrom_mno() {
		return from_mno;
	}
	public void setFrom_mno(int from_mno) {
		this.from_mno = from_mno;
	}
	public Date getSend_date() {
		return send_date;
	}
	public void setSend_date(Date send_date) {
		this.send_date = send_date;
	}
	int cno;
	int cnoref;
	String q1;
	String q2;
	String ad;
	Date invoice_date;
	int cost;
	int from_mno;
	Date send_date;

}
