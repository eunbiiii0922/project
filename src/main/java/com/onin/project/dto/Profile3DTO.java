package com.onin.project.dto;

import lombok.Data;

@Data
public class Profile3DTO {
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getPortfolio_title() {
		return portfolio_title;
	}
	public void setPortfolio_title(String portfolio_title) {
		this.portfolio_title = portfolio_title;
	}
	public String getPortfolio_link() {
		return portfolio_link;
	}
	public void setPortfolio_link(String portfolio_link) {
		this.portfolio_link = portfolio_link;
	}
	public String getPortfolio_explain() {
		return portfolio_explain;
	}
	public void setPortfolio_explain(String portfolio_explain) {
		this.portfolio_explain = portfolio_explain;
	}
	public String getPortfolio_img() {
		return portfolio_img;
	}
	public void setPortfolio_img(String portfolio_img) {
		this.portfolio_img = portfolio_img;
	}
	int mno;
	String portfolio_title;
	String portfolio_link;
	String portfolio_explain;
	String portfolio_img;
}
