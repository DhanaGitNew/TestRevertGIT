package com.enums;

public enum Settings {

	FROM_URL("C//"), TO_URL("D://"), PATH("Files/Log"), FILE_NAME("Loto");

	Settings(String string) {
		
		value = string;
	}

	private String value;

	public String getValue() {
		return value;
	}

}
