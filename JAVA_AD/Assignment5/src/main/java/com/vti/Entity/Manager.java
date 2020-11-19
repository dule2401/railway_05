package com.vti.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * This class is . 
 * 
 * @Description: .
 * @author: LNDu
 * @create_date: Nov 19, 2020
 * @version: 1.0
 * @modifer: LNDu
 * @modifer_date: Nov 19, 2020
 */

@Entity
@Table(name = "Manager", catalog = "TestingSystem")
@PrimaryKeyJoinColumn(name = "AccountID")
public class Manager extends Account implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "ManagementNumberOfYear", nullable = false)
	private short ManagementNumberOfYear;

	/**
	 * Constructor for class Manager.
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Nov 19, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Nov 19, 2020
	 */
	public Manager() {
	}

	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Nov 19, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Nov 19, 2020
	 * @return
	 */
	public short getManagementNumberOfYear() {
		return ManagementNumberOfYear;
	}

	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Nov 19, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Nov 19, 2020
	 * @param managementNumberOfYear
	 */
	public void setManagementNumberOfYear(short managementNumberOfYear) {
		ManagementNumberOfYear = managementNumberOfYear;
	}

	/* 
	* @see java.lang.Object#toString()
	*/
	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Manager [ManagementNumberOfYear=" + ManagementNumberOfYear + "]";
	}
}
