package com.vti.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Entity
@Table(name = "`Salary`", catalog = "TestingSystemabc")
public class Salary implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(name = "SalaryID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short SalaryID;
	@Convert(converter = Salarytype.class)
	@Column(name = "SalaryName", nullable = false, unique = true)
	private Salarytype SalaryName;

	/**
	 * @return the salaryName
	 */
	public Salarytype getSalaryName() {
		return SalaryName;
	}

	/**
	 * @param salaryName the salaryName to set
	 */
	public void setSalaryName(Salarytype salaryName) {
		SalaryName = salaryName;
	}

	/**
	 * @return the salaryID
	 */
	public short getSalaryID() {
		return SalaryID;
	}

	/**
	 * @param salaryID the salaryID to set
	 */
	public void setSalaryID(short salaryID) {
		SalaryID = salaryID;
	}

	/* 
	* @see java.lang.Object#toString()
	*/
	@Override
	public String toString() {
		return "Salary [SalaryID=" + SalaryID + ", SalaryName=" + SalaryName + "]";
	}


}
