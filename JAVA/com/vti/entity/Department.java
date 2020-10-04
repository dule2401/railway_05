package com.vti.entity;
public class Department {
	private  int  departmentID;
	private  String departmentName;
	
	public Department() {
		
	}
	
	public Department(int departmentID,String departmentName ){
		this.departmentID = 0;
		this.departmentName = departmentName;
	}
	public int getId() {
		return departmentID;
	}

	public void setId(int id) {
		this.departmentID = departmentID;
	}

	public String getName() {
		return departmentName;
	}

	public void setName(String name) {
		this.departmentName = departmentName;
	}
	public String toString() {
		return "Department [departmentID=" + departmentID + ", \ndepartmentName=" + departmentName + "]";
	}


}
