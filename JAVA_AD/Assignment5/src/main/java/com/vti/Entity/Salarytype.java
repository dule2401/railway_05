package com.vti.Entity;

public enum Salarytype {
	DEV("600"), TEST("700"),SCRUMMASTER("1500"),PM("2000");

	private String Salarytype;

	/**
	 * Constructor for class Salarytype.
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Nov 17, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Nov 17, 2020
	 * @param Salarytype
	 */
	private Salarytype(String Salarytype) {
		this.Salarytype = Salarytype;
	}

	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Nov 17, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Nov 17, 2020
	 * @return
	 */
	public String getCode() {
		return Salarytype;
	}
}
