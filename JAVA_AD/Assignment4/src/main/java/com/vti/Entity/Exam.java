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

import org.hibernate.annotations.ColumnDefault;
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
@Table(name = "Exam", catalog = "TestingSystemabc")
public class Exam implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(name = "ExamID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short ExamID;

	@Column(name = "`Code1`", nullable = false)
	private String Code1;

	@Column(name = "`Code2`", nullable = false)
	private String Code2;

	@Column(name = "Title", nullable = false, length = 50)
	private String Title;

	@Column(name = "Duration", nullable = false)
	@ColumnDefault("45")
	private short Duration;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CreateDate")
	@CreationTimestamp
	private Date CreateDate;

	/**
	 * @return the examID
	 */
	public short getExamID() {
		return ExamID;
	}

	/**
	 * @param examID the examID to set
	 */
	public void setExamID(short examID) {
		ExamID = examID;
	}

	/**
	 * @return the code1
	 */
	public String getCode1() {
		return Code1;
	}

	/**
	 * @param code1 the code1 to set
	 */
	public void setCode1(String code1) {
		Code1 = code1;
	}

	/**
	 * @return the code2
	 */
	public String getCode2() {
		return Code2;
	}

	/**
	 * @param code2 the code2 to set
	 */
	public void setCode2(String code2) {
		Code2 = code2;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return Title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		Title = title;
	}

	/**
	 * @return the duration
	 */
	public short getDuration() {
		return Duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(short duration) {
		Duration = duration;
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
		return "Exam [ExamID=" + ExamID + ", Code1=" + Code1 + ", Code2=" + Code2 + ", Title=" + Title + ", Duration="
				+ Duration + ", CreateDate=" + CreateDate + "]";
	}

}
