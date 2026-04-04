package com.ed.ms_core_portal.dto;

import com.ed.ms_core_portal.util.Constants;
import com.google.gson.Gson;

public class AuthResponse {

	private int codigo;
	private boolean acceso;
	private String mensaje;

	public AuthResponse(int codigo, boolean acceso, String mensaje) {
		super();
		this.codigo = codigo;
		this.acceso = acceso;
		this.mensaje = mensaje;

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public boolean isAcceso() {
		return acceso;
	}

	public void setAcceso(boolean acceso) {
		this.acceso = acceso;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public static AuthResponse success() {
		return new AuthResponse(Constants.Numbers.NUM_0, true, Constants.Messages.SUCCESS_MESSAGE);
	}

	public static AuthResponse error() {
		return new AuthResponse(Constants.Numbers.NUM_1, false, Constants.Messages.ERROR_MESSAGE);
	}

	  @Override
	    public String toString() {
	        return new Gson().toJson(this);
	    }

}