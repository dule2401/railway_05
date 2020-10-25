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
public class Employee extends User {
private int projectId;
private String proSkill;
/**
 * Constructor for class Employee.
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
 * @param projectId
 * @param proSkill
 */


public int getProjectId() {
	return projectId;
}
/**
 * Constructor for class Employee.
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
 * @param projectId
 * @param proSkill
 */
public Employee(int id, String fullname, String email, int projectId, String proSkill) {
	super(id, fullname, email);
	this.projectId = projectId;
	this.proSkill = proSkill;
}
public void setProjectId(int projectId) {
	this.projectId = projectId;
}
public String getProSkill() {
	return proSkill;
}
public void setProSkill(String proSkill) {
	this.proSkill = proSkill;
}

/* 
* @see java.lang.Object#toString()
*/
@Override
public String toString() {
	return "Employee [projectId=" + projectId + ", proSkill=" + proSkill + ", getId()=" + getId() + ", getFullname()="
			+ getFullname() + ", getEmail()=" + getEmail() + ", toString()=" + super.toString() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + "]";
}




}
