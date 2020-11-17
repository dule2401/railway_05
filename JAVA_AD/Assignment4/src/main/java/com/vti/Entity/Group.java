package com.vti.Entity;

import java.io.Serializable;
import javax.persistence.Column;
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
 * @create_date: Nov 15, 2020
 * @version: 1.0
 * @modifer: LNDu
 * @modifer_date: Nov 15, 2020
 */
@Entity
@Table(name = "`Group`", catalog = "TestingSystemabc")
public class Group implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(name = "GroupID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short GroupID;
	@Column(name = "GroupName", nullable = false, length = 50, unique = true)
	private String GroupName;

	/**
	 * @return the groupID	
	 */
	public short getGroupID() {
		return GroupID;
	}

	/**
	 * @param groupID the groupID to set
	 */
	public void setGroupID(short groupID) {
		GroupID = groupID;
	}

	/**
	 * @return the name
	 */
	public String getGroupName() {
		return GroupName;
	}

	/**
	 * @param name the name to set
	 */
	public void setGroupName(String name) {
		this.GroupName = name;
	}

	/* 
	* @see java.lang.Object#toString()
	*/
	@Override
	public String toString() {
		return "Groups [GroupID=" + GroupID + ", name=" + GroupName + ", getGroupID()=" + getGroupID() + ", getName()="
				+ getGroupName() + "]";
	}
	
}
