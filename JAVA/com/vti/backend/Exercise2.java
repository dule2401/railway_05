package com.vti.backend;

import com.vti.entity.Student;

public class Exercise2 {
	public void question1() {
		
	
	Student student1 = new Student("thương", "thanh hóa", 0);
	student1.setpoin(8);

	Student student2 = new Student("cao anh", "Hà tĩnh",1);
	student1.setpoin(10);

	Student student3 = new Student("lan", "thanh hóa",2);
	student1.setpoin(10);

	student1.setpoin(2);

	System.out.println(student1);
	System.out.println(student2);
	System.out.println(student3);
}
}
