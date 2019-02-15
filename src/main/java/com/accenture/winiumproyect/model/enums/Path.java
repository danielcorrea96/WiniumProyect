package com.accenture.winiumproyect.model.enums;

public enum Path {
	PATH_CALC("C:\\Windows\\System32\\calc.exe"),

	PATH_WINIUM("Winium.Desktop.Driver.exe"),

	RUTA_CONF_WINIUM("http://localhost:9999");	
	
	private String code;

	Path(String code) {
		this.code = code;
	}

	public String getCode() {

		return this.code;

	}
}
