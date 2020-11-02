package com.vti.enity;

public class User {
	private int id;
	private String projectname;
	private int projectId;
	private int idManager;
	private String fullname;
	private String email;
	private String password;

	/**
	 * Constructor for class User.
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
	 */
	public User(String projectname, String fullname, String email) {
		this.projectname= projectname;
		this.fullname = fullname;
		this.email = email;

	}

	/**
	 * Constructor for class User.
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
	 * @return 
	 */
	public void User(int id, String fullname, String email) {
	
		this.id = id;
		this.fullname = fullname;
		this.email = email;
	}

	/**
	 * Constructor for class User.
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Oct 25, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Oct 25, 2020
	 * @param id
	 * @param projectId
	 * @param idManager
	 * @param fullname
	 * @param email
	 * @param password
	 */
	public User(int id, int projectId, int idManager, String fullname, String email) {
		this.id = id;
		this.projectId = projectId;
		this.idManager = idManager;
		this.fullname = fullname;
		this.email = email;

	}

	/**
	 * Constructor for class User.
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Oct 25, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Oct 25, 2020
	 */
	public User() {

	}

	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the projectname
	 */
	public String getProjectname() {
		return projectname;
	}

	/**
	 * @param projectname the projectname to set
	 */
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	/**
	 * @return the projectId
	 */
	public int getProjectId() {
		return projectId;
	}

	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	/**
	 * @return the idManager
	 */
	public int getIdManager() {
		return idManager;
	}

	/**
	 * @param idManager the idManager to set
	 */
	public void setIdManager(int idManager) {
		this.idManager = idManager;
	}

	/**
	 * @return the fullname
	 */
	public String getFullname() {
		return fullname;
	}

	/**
	 * @param fullname the fullname to set
	 */
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/*
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", fullname=" + fullname + ", email=" + email + ", password=" + password
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}

