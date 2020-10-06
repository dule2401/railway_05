package Testing5.vti.entity.exe2.question2;

import java.util.Scanner;

public class StuDent extends Person {

	private int idSV;
	private float diemTB;
	private String email;

	public StuDent() {
		inputInfo();
	}

	
	public int getMaSV() {
		return idSV;
	}


	public void setMaSV(int maSV) {
		this.idSV = maSV;
	}


	public float getDiemTB() {
		return diemTB;
	}


	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	protected void inputInfo() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập mã sinh viên: ");
		idSV = scanner.nextInt();

		super.inputInfo();

		System.out.println("Nhập điểm trung bình: ");
		diemTB = scanner.nextFloat();

		System.out.println("Nhập email: ");
		email = scanner.nextLine();

	}

	@Override
	public void showInfo() {
		System.out.println("Mã sinh viên: " + idSV);
		super.showInfo();
		System.out.println("Điểm trung bình: " + diemTB);
		System.out.println("Email: " + diemTB);
	}

	public boolean isStudentGetScholarship() {
		return diemTB >= 8;
	}


	@Override
	public String toString() {
		return "StuDent [maSV=" + idSV + ", diemTB=" + diemTB + ", email=" + email + "]";
	}
	
}
