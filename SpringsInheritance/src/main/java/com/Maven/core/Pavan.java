package com.Maven.core;

public class Pavan {

	private String type;
	private String action;
	private String Country;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	@Override
	public String toString() {
		return "Service [type=" + type + ", action=" + action + ", Country="
				+ Country + "]";
	}

}