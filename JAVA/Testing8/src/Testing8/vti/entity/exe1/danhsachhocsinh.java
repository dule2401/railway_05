package Testing8.vti.entity.exe1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class danhsachhocsinh {
	private ArrayList<Student> students;
	Scanner scanner;

	public void danhsachhocsinh() {
		Stack<Student> students = new Stack<>();
		students.add(new Student(1, "nguyễn văn huyên"));
		students.add(new Student(2, "trần văn nam"));
		students.add(new Student(3, "nguyễn văn a"));
		System.out.println(students.pop());
		System.out.println(students.pop());
		System.out.println(students.pop());
}
	public void Sortstudent() {
		Queue<Student> students = new LinkedList<>();
		students.add(new Student(1, "nguyễn văn huyên"));
		students.add(new Student(2, "trần văn nam"));
		students.add(new Student(3, "nguyễn văn a"));
		System.out.println(students.poll());
		System.out.println(students.poll());
		System.out.println(students.poll());
	}
}
