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
@Table(name = "Employee", catalog = "TestingSystem")
@PrimaryKeyJoinColumn(name = "AccountID")
public class Employee extends Account implements Serializable{
	private static final long serialVersionUID = 1L;

	@Column(name = "WorkingNumberOfYear", nullable = false)
	private short WorkingNumberOfYear;

	public Employee() {
	}

	public short getWorkingNumberOfYear() {
		return WorkingNumberOfYear;
	}

	public void setWorkingNumberOfYear(short workingNumberOfYear) {
		WorkingNumberOfYear = workingNumberOfYear;
	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Employee [WorkingNumberOfYear=" + WorkingNumberOfYear + "]";
	}

}
