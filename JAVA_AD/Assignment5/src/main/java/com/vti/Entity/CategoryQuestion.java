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
 * @create_date: Nov 17, 2020
 * @version: 1.0
 * @modifer: LNDu
 * @modifer_date: Nov 17, 2020
 */
@Entity
@Table(name = "CategoryQuestion", catalog = "TestingSystem")
public class CategoryQuestion   implements Serializable{
	private static final long serialVersionUID = 1L;
	@Column(name = "CategoryID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short CategoryID;

	@Column(name = "CategoryName", nullable = false,length =50, unique = true)
	private String CategoryName;
	
	

	/**
	 * @return the categoryID
	 */
	public short getCategoryID() {
		return CategoryID;
	}

	/**
	 * @param categoryID the categoryID to set
	 */
	public void setCategoryID(short categoryID) {
		CategoryID = categoryID;
	}

	/**
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return CategoryName;
	}

	/**
	 * @param categoryName the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

	/* 
	* @see java.lang.Object#toString()
	*/
	@Override
	public String toString() {
		return "CategoryQuestion [CategoryID=" + CategoryID + ", CategoryName=" + CategoryName + "]";
	}
	
}
