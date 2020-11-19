package com.vti.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name = "`Position`", catalog = "TestingSystem")
public class Position implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(name = "PositionID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short PositionID;
	@Enumerated(EnumType.STRING)
	@Column(name = "PositionName", nullable = false, unique = true)
	private Type type;
	

	@OneToMany(mappedBy = "position")
	private List<Account> accounts;

	/**
	 * @return the groupID
	 */
	public short getGroupID() {
		return PositionID;
	}

	/**
	 * @param groupID the groupID to set
	 */
	public void setGroupID(short groupID) {
		PositionID = groupID;
	}

	/**
	 * @return the type
	 */
	public Type getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(Type type) {
		this.type = type;
	}

	/*
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Position [PositionID=" + PositionID + ", type=" + type + "]";
	}

}
