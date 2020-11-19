package com.vti.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

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
@Table(name = "Answer", catalog = "TestingSystem")
public class Answer implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(name = "Answers")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short Answers;

	@Column(name = "Content", nullable = false, length = 100)
	private String Content;

	@Column(name = "isCorrect")
	@Convert(converter = Answertype.class)
	@ColumnDefault("1")
	private Answertype isCorrect;

	/**
	 * @return the answers
	 */
	public short getAnswers() {
		return Answers;
	}

	/**
	 * @param answers the answers to set
	 */
	public void setAnswers(short answers) {
		Answers = answers;
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
	 * @return the isCorrect
	 */
	public Answertype getIsCorrect() {
		return isCorrect;
	}

	/**
	 * @param isCorrect the isCorrect to set
	 */
	public void setIsCorrect(Answertype isCorrect) {
		this.isCorrect = isCorrect;
	}

	/* 
	* @see java.lang.Object#toString()
	*/
	@Override
	public String toString() {
		return "Answer [Answers=" + Answers + ", Content=" + Content + ", isCorrect=" + isCorrect + "]";
	}


}
