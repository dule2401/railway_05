package com.vti.Entity;

/**
 * This class is .
 * 
 * @Description: .
 * @author: LNDu
 * @create_date: Nov 17, 2020
 * @version: 1.0
 * @modifer: LNDu
 * @modifer_date: Nov 17, 2020
 */
public enum TypeQuestiontype {
	ESAY("0"), MULTIPLE_CHOICE("1");

	private String code;

	private TypeQuestiontype(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}
}
