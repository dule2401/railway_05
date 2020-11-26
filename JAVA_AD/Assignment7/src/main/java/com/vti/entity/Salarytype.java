package com.vti.entity;

public enum Salarytype {
	DEV("600"), TEST("700"),SCRUMMASTER("1500"),PM("2000");

	private String Salarytype;

	
	private Salarytype(String Salarytype) {
		this.Salarytype = Salarytype;
	}

	
	public String getCode() {
		return Salarytype;
	}
}

