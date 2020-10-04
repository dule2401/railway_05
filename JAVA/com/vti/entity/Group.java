package com.vti.entity;
import java.time.LocalDate;
import java.util.Arrays;
public class Group {
	private  int groupID;
	private  String groupName;
	private  int creatorID;
	private  LocalDate createDate;
	private  Account[]accounts;
	
	
	public Group () {
		
	}
	public Group(int groupID,String groupName,int creatorID,LocalDate createDate,Account[]accounts,String[]usernames ){
		this.groupID = groupID;
		this.groupName = groupName;
		this.creatorID = creatorID;
		this.createDate = createDate;
		this.accounts = accounts;
		Account[] accounts1 = new Account[usernames.length];
		for (int i = 0; i < usernames.length; i++) {
			accounts1[i] = new Account(usernames[i]);
		}
		}
	@Override
	public String toString() {
		return "Group [groupID=" + groupID + ", \ngroupName=" + groupName + ", /ncreatorID=" + creatorID + ", /ncreateDate="
				+ createDate + ", /naccounts=" + Arrays.toString(accounts) + "]";
	}
	public int getGroupID() {
		return groupID;
	}
	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public int getCreatorID() {
		return creatorID;
	}
	public void setCreatorID(int creatorID) {
		this.creatorID = creatorID;
	}
	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	public Account[] getAccounts() {
		return accounts;
	}
	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
	

}
	