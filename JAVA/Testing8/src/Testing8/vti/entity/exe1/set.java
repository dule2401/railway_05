package Testing8.vti.entity.exe1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class set {
	private Set<Student> students;
	private Scanner scanner;

	public void setstudent () {
		scanner = new Scanner(System.in);
		students = new HashSet<>();
		students.add(new Student(1, "du"));
		students.add(new Student(2, "anh"));
		students.add(new Student(3, "ngáo"));
		students.add(new Student(4, "ngơ"));
		students.add(new Student(5, "ghét"));
	}
	public void frintallset() {
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.size());
		}
	}
	public void namestudent() {
		
	}
}
