package Testing7.vti.backend.ex2;

import Testing7.vti.entity.ex1.Student;
import Testing7.vti.entity.exe2.MyMarth;
import Testing7.vti.entity.exe2.PrimaryStudent;
import Testing7.vti.entity.exe2.SecondaryStudent;

public class Program1 {
	public void question1() {
		System.out.println(MyMarth.sum(6));
	}

	public void question2() throws Exception {
		Student student1 = new Student(1, "du", 0);
		System.out.println(student1);
		Student student2 = new Student(2, "anh", 0);
		System.out.println(student2);
	}

	public void question3() {
		PrimaryStudent.study();
		SecondaryStudent.study();
	}
}
