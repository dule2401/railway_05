package Testing5.vti.backend.exe2.question1;

import Testing5.vti.entity.exe2.question1.Student1;

public class programquestion1 {

	private Student1[] students;

	public programquestion1() {
		students = new Student1[10];
	}

	public void initStudents() {
		students[1] = new Student1(1, "du", 1);
		students[2] = new Student1(2, "cao Anh", 1);
		students[3] = new Student1(3, "đạt", 1);
		students[4] = new Student1(4, "Chiến", 2);
		students[5] = new Student1(5, "linh", 2);
		students[6] = new Student1(6, "thương", 2);
		students[7] = new Student1(7, "ngọc", 3);
		students[8] = new Student1(8, "lan", 3);
		students[9] = new Student1(9, "long", 3);
		students[10] = new Student1(10, "doanh", 3);
	}

	public void caLopDiemDanh() {
		for (int i = 1; i <= 10; i++) {
			students[i].diemdanh();
		}
	}

	public void nhomDiHocBai() {
		for (int i = 1; i <= 10; i++) {
			if (students[i].getGroup() == 1) {
				students[i].hocbai();
			}
		}
	}

	public void nhomDiDonVeSinh() {
		for (int i = 1; i <= 10; i++) {
			if (students[i].getGroup() == 2) {
				students[i].donvesinh();
			}
		}
	}
}
