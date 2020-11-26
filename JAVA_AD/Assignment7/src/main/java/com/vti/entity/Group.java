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

@Entity
@Table(name = "`Group`", catalog = "TestingSystem")
public class Group implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(name = "GroupID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short GroupID;
	@Column(name = "GroupName", nullable = false, length = 50, unique = true)
	private String GroupName;

	@OneToMany(mappedBy = "group", fetch = FetchType.EAGER)
	private List<GroupAccount> accounts;
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
