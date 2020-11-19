package com.vti.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

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
@Table(name = "Question", catalog = "TestingSystem")
public class Question implements Serializable{
	private static final long serialVersionUID = 1L;
	@Column(name = "QuestionID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short QuestionID;
	
	@Column(name = "Content", nullable = false,length = 100)
	private String Content;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CreateDate")
	@CreationTimestamp
	private Date CreateDate;

	/**
	 * @return the questionID
	 */
	public short getQuestionID() {
		return QuestionID;
	}

	/**
	 * @param questionID the questionID to set
	 */
	public void setQuestionID(short questionID) {
		QuestionID = questionID;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return Content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		Content = content;
	}

	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return CreateDate;
	}

	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}

	/* 
	* @see java.lang.Object#toString()
	*/
	@Override
	public String toString() {
		return "Question [QuestionID=" + QuestionID + ", Content=" + Content + ", CreateDate=" + CreateDate + "]";
	}
	
	

}
