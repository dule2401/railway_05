package com.vti.Entity;

public enum Answertype {
	TRUE("1"), FALSE("0");

	private String Answertype;

	/**
	 * Constructor for class Answertype.
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Nov 17, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Nov 17, 2020
	 * @param salarytype
	 */
	private Answertype(String salarytype) {
		Answertype = salarytype;
	}

	/**
	 * Constructor for class Answertype.
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Nov 17, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Nov 17, 2020
	 */
	public String getAnswertype() {
		return Answertype;
	}

}
