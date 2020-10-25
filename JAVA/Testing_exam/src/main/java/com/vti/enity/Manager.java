package com.vti.enity;

/**
 * This class is .
 * 
 * @Description: .
 * @author: LNDu
 * @create_date: Oct 25, 2020
 * @version: 1.0
 * @modifer: LNDu
 * @modifer_date: Oct 25, 2020
 */
public class Manager extends User {
	private int expInYear;

	/**
	 * Constructor for class Manager.
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Oct 25, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Oct 25, 2020
	 * @param id
	 * @param fullname
	 * @param email
	 * @param password
	 * @param expInYear
	 */
	

	public int getExpInYear() {
		return expInYear;
	}

	/**
	 * Constructor for class Manager.
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Oct 25, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Oct 25, 2020
	 * @param id
	 * @param fullname
	 * @param email
	 * @param expInYear
	 */
	public Manager(int id, String fullname, String email, int expInYear) {
		super(id, fullname, email);
		this.expInYear = expInYear;
	}

	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}

	/* 
	* @see java.lang.Object#toString()
	*/
	@Override
	public String toString() {
		return "Manager [expInYear=" + expInYear + ", getId()=" + getId() + ", getFullname()=" + getFullname()
				+ ", getEmail()=" + getEmail() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	
	

}
