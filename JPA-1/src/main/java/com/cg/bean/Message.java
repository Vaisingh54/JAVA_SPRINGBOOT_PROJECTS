package com.cg.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Messages_master")
public class Message {
	@Id
	@Column(name = "MessageID")
	private int msgId;
	@Column(name = "Message")
	private String msg;
	public int getMsgId() {
		return msgId;
	}
	public void setMsgId(int msgId) {
		this.msgId = msgId;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Message(int msgId, String msg) {
		super();
		this.msgId = msgId;
		this.msg = msg;
	}
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Message [msgId=" + msgId + ", msg=" + msg + "]";
	} 
	
	
	
	
	

}
