package Testing8.vti.backend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import Testing8.vti.entity.exe1.Student;

public class Program {
	// Question 1: List
	// Tạo 1 student có property id, name (trong đó có 3 student có name
	// trùng nhau, id sẽ là auto increment)
	// Khai báo 1 ArrayList students, sau đó
	// a) In ra tổng số phần tử của students
	// b) Lấy phần tử thứ 4 của students
	// c) In ra phần tử đầu và phần tử cuối của students
	// d) Thêm 1 phần tử vào vị trí đầu của students
	// e) Thêm 1 phần tử vào vị trí cuối của students
	// f) Đảo ngược vị trí của students
	// g) Tạo 1 method tìm kiếm student theo id
	// h) Tạo 1 method tìm kiếm student theo name
	// i) Tạo 1 method để in ra các student có trùng tên
	// j) Xóa name của student có id = 2;
	// k) Delete student có id = 5;
	// l) Tạo 1 ArrayList tên là studentCopies và add tất cả students vào
	// studentCopies
	private ArrayList<Student> students;
	Scanner scanner;

	public void ArrayListStudent() {
		students = new ArrayList<>();
		students.add(new Student(1, "du"));
		students.add(new Student(2, "anh"));
		students.add(new Student(3, "ngáo"));
		students.add(new Student(4, "ngơ"));
		students.add(new Student(5, "ghét"));
	}
//a

	public void printallsize() {
		System.out.println("số lượng student là : ");
		System.out.println(Student.getCounter());
	}

//b
	public void printbyidnumber3() {
		System.out.println("thông tin student thứ 4 là: ");
		System.out.println(students.get(3));
	}

//c) In ra phần tử đầu và phần tử cuối của students
	public void firtstudentandlaststudent() {
		System.out.println(students.get(0));
		System.out.println(students.get(students.size()));
	}

//d
	public void addstudent() {
		students.add(0, new Student(7, "anh"));
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
	}

//e) Thêm 1 phần tử vào vị trí cuối của students
	public void addstudentlast() {
		students.add(students.size(), new Student(7, "anhmax"));
		for (int j = 0; j < students.size(); j++) {
			System.out.println(students.get(j));
		}
	}

//f) Đảo ngược vị trí của students
	public void daonguoc() {
		Collections.reverse(students);
		System.out.println(students);
	}

//g) Tạo 1 method tìm kiếm student theo id
	public void seachstudentbyid() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời nhập id cần tìm: ");
		int Id = scanner.nextInt();
		for (Student student : students) {
			if (student.getId() == Id) {
				System.out.println(student);
			} else
				System.out.println("Không có học sinh nào có id = " + Id);
			return;
		}
	}

	public void seachstudentbyname() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời nhập name cần tìm: ");
		String name = scanner.nextLine();
		for (Student student : students) {
			if (student.getName() == name) {
				System.out.println(student);
			} else
				System.out.println("Không có học sinh nào tên : " + name);
			return;
		}
	}

	public void TrungTen() {
		for (int i = 0; i < students.size(); i++) {
			for (int j = i + 1; j < students.size(); j++) {
				if (students.get(i).getName().equals(students.get(j).getName())) {
					System.out.println("Học sinh trùng tên là: ");
					System.out.println(students.get(i));
					return;
				}
			}

		}
	}
}
