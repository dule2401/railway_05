package com.vti.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Convert;
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
@Table(name = "TypeQuestion", catalog = "TestingSystem")
public class TypeQuestion  implements Serializable{
	private static final long serialVersionUID = 1L;
	@Column(name = "TypeID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short TypeID;
	@Convert(converter = TypeQuestiontype.class)
	@Column(name = "TypeName", nullable = false, unique = true)
	private TypeQuestiontype TypeName;
	/**
	 * @return the typeID
	 */
	public short getTypeID() {
		return TypeID;
	}
	/**
	 * @param typeID the typeID to set
	 */
	public void setTypeID(short typeID) {
		TypeID = typeID;
	}
	/**
	 * @return the typeName
	 */
	public TypeQuestiontype getTypeName() {
		return TypeName;
	}
	/**
	 * @param typeName the typeName to set
	 */
	public void setTypeName(TypeQuestiontype typeName) {
		TypeName = typeName;
	}
	/* 
	* @see java.lang.Object#toString()
	*/
	@Override
	public String toString() {
		return "TypeQuestion [TypeID=" + TypeID + ", TypeName=" + TypeName + "]";
	}
	
	
}
