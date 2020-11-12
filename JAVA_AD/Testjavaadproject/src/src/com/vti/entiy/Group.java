package com.vti.entiy;

import java.util.Date;

/**
 * This class is Group entity.
 * 
 * @Description: .
 * @author: NNDuy
 * @create_date: May 28, 2020
 * @version: 1.0
 * @modifer: NNDuy
 * @modifer_date: May 28, 2020
 */
public class Group {

	private int id;
	private String name;
	private Date createTime;

	/**
	 * Constructor for class Group.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Jun 19, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Jun 19, 2020
	 */
	public Group() {
	}
	
	
	/**
	 * Constructor for getting list group.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Jun 19, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Jun 19, 2020
	 * @param id
	 * @param name
	 * @param createTime
	 */
	public Group(int id, String name, Date createTime) {
		this.id = id;
		this.name = name;
		this.createTime = createTime;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
