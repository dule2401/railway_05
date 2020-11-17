package com.vti.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

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
@Table(name = "`Account`", catalog = "TestingSystemabc")
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

	@Column(name = "FirstName", nullable = false, length = 50)
	private String FirstName;

	@Column(name = "LastName", nullable = false, length = 50)
	private String LastName;

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
		return FirstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return LastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		LastName = lastName;
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
		return "Account [AccountID=" + AccountID + ", Email=" + Email + ", Username=" + Username + ", FirstName="
				+ FirstName + ", LastName=" + LastName + ", CreateDate=" + CreateDate + "]";
	}

}
