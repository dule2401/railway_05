package com.vti.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Formula;

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
@Table(name = "`Account`", catalog = "TestingSystem")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(name = "PositionID")
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short AccountID;

	@Column(name = "Email", nullable = false, length = 50, unique = true)
	private String Email;

	@Column(name = "Username", nullable = false, length = 50, unique = true)
	private String Username;

	@Column(name = "FirstName", length = 50, nullable = false)
	private String firstName;

	@Column(name = "LastName", length = 50, nullable = false)
	private String lastName;

	@Formula(" concat(FirstName, ' ', LastName) ")
	private String fullName;
	
	@ManyToOne
	@JoinColumn(name = "DepartmentID", nullable = false)
	private Department department;

	@ManyToOne
	@JoinColumn(name = "PositionID", nullable = false)
	private Position position;

	@ManyToOne
	@JoinColumn(name = "SalaryID", nullable = false)
	private Salary salary;
	
	@OneToMany(mappedBy = "creator")
	private List<Group> createdGroup;

	@OneToMany(mappedBy = "account")
	private List<GroupAccount> groups;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CreateDate")
	@CreationTimestamp
	private Date CreateDate;

	/**
	 * @return the accountID
	 */
	public short getAccountID() {
		return AccountID;
	}

	/**
	 * @param accountID the accountID to set
	 */
	public void setAccountID(short accountID) {
		AccountID = accountID;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Email = email;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return Username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		Username = username;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}

	/**
	 * @return the position
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(Position position) {
		this.position = position;
	}

	/**
	 * @return the salary
	 */
	public Salary getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	/**
	 * @return the createdGroup
	 */
	public List<Group> getCreatedGroup() {
		return createdGroup;
	}

	/**
	 * @param createdGroup the createdGroup to set
	 */
	public void setCreatedGroup(List<Group> createdGroup) {
		this.createdGroup = createdGroup;
	}

	/**
	 * @return the groups
	 */
	public List<GroupAccount> getGroups() {
		return groups;
	}

	/**
	 * @param groups the groups to set
	 */
	public void setGroups(List<GroupAccount> groups) {
		this.groups = groups;
	}

	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return CreateDate;
	}

	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}

	/* 
	* @see java.lang.Object#toString()
	*/
	@Override
	public String toString() {
		return "Account [AccountID=" + AccountID + ", Email=" + Email + ", Username=" + Username + ", firstName="
				+ firstName + ", lastName=" + lastName + ", fullName=" + fullName + ", department=" + department
				+ ", position=" + position + ", salary=" + salary + ", createdGroup=" + createdGroup + ", groups="
				+ groups + ", CreateDate=" + CreateDate + "]";
	}
	
	

}