package com.cg.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Message_master")
public class Message {
	
	@Id
	@Column(name = "MessageID")
	private int msgID;
	@Column(name = "Message")
	private String msg;
	public int getMsgID() {
		return msgID;
	}
	public void setMsgID(int msgID) {
		this.msgID = msgID;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Message(int msgID, String msg) {
		super();
		this.msgID = msgID;
		this.msg = msg;
	}
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Message [msgID=" + msgID + ", msg=" + msg + "]";
	}
	
	
	
	
	
	

}
