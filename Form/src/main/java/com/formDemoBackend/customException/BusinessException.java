package com.formDemoBackend.customException;

import org.springframework.stereotype.Component;

@Component
public class BusinessException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String  errCode;
	private String  errMessage;
	public String getErrCode() {
		return errCode;
	}
	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}
	public String getErrMessage() {
		return errMessage;
	}
	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public BusinessException(String errCode, String errMessage) {
		super();
		this.errCode = errCode;
		this.errMessage = errMessage;
	}
	
	public BusinessException() {
		
	}

}
