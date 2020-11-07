package com.onin.project.dto;

import lombok.Data;

@Data
public class Profile2DTO {
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getCareer() {
		return career;
	}
	public void setCareer(String career) {
		this.career = career;
	}
	public String getCareerDetail() {
		return careerDetail;
	}
	public void setCareerDetail(String careerDetail) {
		this.careerDetail = careerDetail;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getCareer_file() {
		return career_file;
	}
	public void setCareer_file(String career_file) {
		this.career_file = career_file;
	}
	int mno;
	String career;
	String careerDetail;
	String skill;
	String career_file;
}
