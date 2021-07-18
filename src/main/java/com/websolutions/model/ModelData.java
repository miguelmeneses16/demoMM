package com.websolutions.model;

import java.io.Serializable;

public class ModelData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7557886034025301027L;
	private int code;
	private String mensaje;
	private boolean status;
	
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	

}
