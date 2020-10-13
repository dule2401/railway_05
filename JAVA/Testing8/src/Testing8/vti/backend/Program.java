package Testing8.vti.backend;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Testing8.vti.entity.exe1.Student;

public class Program {
	private List<Student> students;

	public void Comparing() {
		students = new ArrayList<>();
		inputStudents();
	}

	private void inputStudents() {
		students.add(new Student("du", LocalDate.parse("1997-08-05"), 10));
		students.add(new Student("anh", LocalDate.parse("1997-01-24"), 10));
		students.add(new Student("lan", LocalDate.parse("1997-11-01"), 6));
		students.add(new Student("thương", LocalDate.parse("1997-11-19"), 5));
		students.add(new Student("ngọc", LocalDate.parse("1997-10-06"), 8));
		students.add(new Student("đức", LocalDate.parse("2000-12-25"), 3));

		System.out.println("List student vừa khởi tạo: ");
		printStudent();
	}

	private void printStudent() {
		for (Student st : students) {
			System.out.println(st);
		}
	}

//	Question 1: Comparable 

	public void question1() {
		Collections.sort(students);

		System.out.println("List sau khi sắp xếp theo tên/ ngày sinh/ điểm: ");
		printStudent();
	}

}

