package Testing5.vti.backend.exe2.question2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Testing5.vti.entity.exe2.question2.StuDent;

public class programquestion2 {
	private List<StuDent> students;
	private Scanner scanner;

	public programquestion2() {
		students = new ArrayList<>();
		scanner = new Scanner(System.in);
	}

	public void input() {
		System.out.println("Nhập số sinh viên muốn nhập : ");
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Nhập sinh viên thứ : " + (i+1));
			students.add(new StuDent());
		}

	}

	public void showInforStudents() {
		for (StuDent student : students) {
			student.showInfo();
		}
	}

	public void xetHocBong() {
		System.out.println("Nhập tên sinh viên muốn xét:");
		String name = scanner.nextLine();

		for (StuDent student : students) {
			if (student.getName().equals(name)) {
				if (student.isStudentGetScholarship()) {
					System.out.println("Sinh viên này được học bổng !");
				} else {
					System.out.println("Không được học bổng !");
				}
				break;
			}
		}
	}
}
