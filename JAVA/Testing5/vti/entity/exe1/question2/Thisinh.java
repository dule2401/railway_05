package Testing5.vti.entity.exe1.question2;

import java.util.Scanner;

public class Thisinh {
private String sobaodanh;
private String hoten;
private String diachi;
private String mocuutien;
private khoihoc khoi;

public Thisinh () {
	Scanner scanner = new Scanner(System.in);

	System.out.println("Nhập số báo danh: ");
	sobaodanh = scanner.nextLine();

	System.out.println("Nhập họ tên: ");
	hoten = scanner.nextLine();

	System.out.println("Nhập địa chỉ: ");
	diachi = scanner.nextLine();

	System.out.println("Nhập mức ưu tiên: ");
	mocuutien = scanner.nextLine();

	System.out.println("Nhập khối A/B/C");
	khoi = new khoihoc();
	khoi.setTen(scanner.nextLine());
	
}


public Thisinh(String sobaodanh, String hoten, String diachi, String mocuutien, khoihoc khoi) {
	super();
	this.sobaodanh = sobaodanh;
	this.hoten = hoten;
	this.diachi = diachi;
	this.mocuutien = mocuutien;
	this.khoi = khoi;
}


public String getSobaodanh() {
	return sobaodanh;
}


public void setSobaodanh(String sobaodanh) {
	this.sobaodanh = sobaodanh;
}


public String getHoten() {
	return hoten;
}


public void setHoten(String hoten) {
	this.hoten = hoten;
}


public String getDiachi() {
	return diachi;
}


public void setDiachi(String diachi) {
	this.diachi = diachi;
}


public String getMocuutien() {
	return mocuutien;
}


public void setMocuutien(String mocuutien) {
	this.mocuutien = mocuutien;
}


public khoihoc getKhoi() {
	return khoi;
}


public void setKhoi(khoihoc khoi) {
	this.khoi = khoi;
}


@Override
public String toString() {
	return "Thisinh [sobaodanh=" + sobaodanh + ", hoten=" + hoten + ", diachi=" + diachi + ", mocuutien=" + mocuutien
			+ ", khoi=" + khoi + "]";
}









}
