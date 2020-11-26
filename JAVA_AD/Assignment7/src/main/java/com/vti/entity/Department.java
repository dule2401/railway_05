package com.vti.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Department", catalog = "TestingSystem")
public class Department implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(name = "DepartmentID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short DepartmentID;
	
	@Size(min= 0 ,max = 50,message = "name has at lease 6 charater and 50 charater")
	@Column(name = "DepartmentName", nullable = false, length = 50, unique = true)
	private String DepartmentName;

	@OneToMany(mappedBy = "department", fetch = FetchType.EAGER)
	private List<Account> accounts;
	/**
	 * @return the groupID
	 */
	public short getDepartmentID() {
		return DepartmentID;
	}
	/**
	 * @param groupID the groupID to set
	 */
	public void setDepartmentID(short DepartmentID) {
		this.DepartmentID = DepartmentID;
	}
	/**
	 * @return the name
	 */
	public String getDepartmentName() {
		return DepartmentName;
	}
	/**
	 * @param name the name to set
	 */
	public void setDepartmentName(String name) {
		this.DepartmentName = name;
	}
	/* 
	* @see java.lang.Object#toString()
	*/
	@Override
	public String toString() {
		return "Department [GroupID=" + DepartmentID + ", name=" + DepartmentName + "]";
	}
	
	
}

