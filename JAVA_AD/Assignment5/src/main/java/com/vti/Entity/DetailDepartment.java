package com.vti.Entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "DetailDepartment", catalog = "TestingSystem")
@PrimaryKeyJoinColumn(name = "DepartmentID")
public class DetailDepartment extends Department implements Serializable{

	private static final long serialVersionUID = 1L;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "AddressID", referencedColumnName = "AddressID")
	private Address address;

	@Column(name = "EmulationPoint")
	private short emulationPoint;

	public DetailDepartment() {
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public short getEmulationPoint() {
		return emulationPoint;
	}

	public void setEmulationPoint(short emulationPoint) {
		this.emulationPoint = emulationPoint;
	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		return "DetailDepartment [" + "emulationPoint=" + emulationPoint + "]";
	}
}
