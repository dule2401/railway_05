package com.vti.entiy;

/**
 * This class is User entity.
 * 
 * @Description: .
 * @author: NNDuy
 * @create_date: May 28, 2020
 * @version: 1.0
 * @modifer: NNDuy
 * @modifer_date: May 28, 2020
 */
public class User {

	private int id;
	private String username;
	private String password;
	private String fullName;
	private String role;

	/**
	 * Constructor for class User.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: May 28, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: May 28, 2020
	 */
	public User() {
	}

	/**
	 * Constructor for Getting List Users.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Jun 19, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Jun 19, 2020
	 * @param id
	 * @param username
	 * @param fullName
	 * @param role
	 */
	public User(int id, String username, String fullName, String role) {
		this.id = id;
		this.username = username;
		this.fullName = fullName;
		this.role = role;
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
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
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
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

}
