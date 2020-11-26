package com.vti.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "GroupAccount")
public class GroupAccount {
	
	@Valid
	@EmbeddedId
	private GroupAccountKey id;

	@Valid
	@ManyToOne
	@MapsId("AccountID")
	@JoinColumn(name = "AccountID")
	private Account account;
		
	@Valid
	@ManyToOne
	@MapsId("GroupID")
	@JoinColumn(name = "GroupID")
	private Group group;

	@Column(name = "JoinDate")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date joinDate;

	public GroupAccount() {
	}

	public GroupAccountKey getId() {
		return id;
	}

	public void setId(GroupAccountKey id) {
		this.id = id;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	/* 
	* @see java.lang.Object#toString()
	*/
	@Override
	public String toString() {
		return "GroupAccount [id=" + id + ", account=" + account + ", group=" + group + ", joinDate=" + joinDate + "]";
	}
	
}
