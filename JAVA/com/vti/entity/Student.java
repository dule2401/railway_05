package com.vti.entity;

public class Student {
	private int id;
	private String name;
	private String hometown;
	private float poin;
	public Student(String name, String hometown,float poin) {
		super();
		this.name = name;
		this.hometown = hometown;
		this.poin = 0;
	}

	public static void main(String[] args) {
		
	}
	public void setpoin(float poin) {
		this.poin = poin;
	}

	public void setPoin(float poin) {
		this.poin = this.poin + poin;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPoin() {
		String hanhkiem;
		if (poin < 4.0) {
			hanhkiem = "Yếu";
		} else if (poin < 6) {
			hanhkiem = "Trung bình";
		} else if (poin < 8) {
			hanhkiem = "Khá";
		} else {
			hanhkiem = "Giỏi";
		}
		return "Student{" + "id=" + id + ", name='" + name + '\'' + ", hometown='" + hometown + '\'' + ", score="
		+ poin + ", xepLoai='" + hanhkiem + '\'' + '}';
	}
}








