package com.vti.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

public class GroupAccountKey implements Serializable {
	private static final long serialVersionUID = 1L;

	@NotEmpty
	@Column(name = "GroupID")
	private short groupId;

	@NotEmpty
	@Column(name = "AccountID")
	private short accountId;

	public GroupAccountKey() {
	}

	/**
	 * This method is .
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Nov 19, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Nov 19, 2020
	 * @return
	 */
	public short getGroupId() {
		return groupId;
	}

	/**
	 * This method is .
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Nov 19, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Nov 19, 2020
	 * @param groupId
	 */
	public void setGroupId(short groupId) {
		this.groupId = groupId;
	}

	/**
	 * This method is .
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Nov 19, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Nov 19, 2020
	 * @return
	 */
	public short getAccountId() {
		return accountId;
	}

	/**
	 * This method is .
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Nov 19, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Nov 19, 2020
	 * @param accountId
	 */
	public void setAccountId(short accountId) {
		this.accountId = accountId;
	}

	/*
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GroupAccountKey [groupId=" + groupId + ", accountId=" + accountId + "]";
	}
}

