package com.example.demo.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private Integer status;
	private String msg;
	private long timeStap;
	
	public StandardError(Integer status, String msg, long timeStap) {
		super();
		this.status = status;
		this.msg = msg;
		this.timeStap = timeStap;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public long getTimeStap() {
		return timeStap;
	}

	public void setTimeStap(long timeStap) {
		this.timeStap = timeStap;
	}
	
	

}
