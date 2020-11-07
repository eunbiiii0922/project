package com.onin.project.dto;

import java.util.Date;

import lombok.Data;
@Data
public class ChatDTO {

	public int getFrom_mno() {
		return from_mno;
	}
	public void setFrom_mno(int from_mno) {
		this.from_mno = from_mno;
	}
	public String getGetChat() {
		return getChat;
	}
	public void setGetChat(String getChat) {
		this.getChat = getChat;
	}
	public String getSendChat() {
		return sendChat;
	}
	public void setSendChat(String sendChat) {
		this.sendChat = sendChat;
	}
	public int getTo_mno() {
		return to_mno;
	}
	public void setTo_mno(int to_mno) {
		this.to_mno = to_mno;
	}
	public Date getChatDate() {
		return chatDate;
	}
	public void setChatDate(Date chatDate) {
		this.chatDate = chatDate;
	}
	int from_mno;
	String getChat;
	String sendChat;
	int to_mno;
	Date chatDate;
	
}
