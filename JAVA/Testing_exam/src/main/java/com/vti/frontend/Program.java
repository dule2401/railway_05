package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.ultis.Scannerutils;



public class Program {
public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
	Funtion funtion = new Funtion();
	System.out.println("Moi ban nhap chuc nang muon su dung:\n" + "1: In ra danh sách các User trong  project theo id project\n"
			+ "2: Tìm  tất cả Manager của các project\n"  + "3: Login\n" + "4: Thoat khoi chuong trinh\n ");

	while (true) {
		System.out.println("Mời bạn nhập chức năng : ");
		int choose  = Scannerutils.inputInt();

	switch (choose) {
		case 1:
			funtion.getuserbyid();
			
			break;
		case 2:
			funtion.getManagerbyid();
			break;
		case 3:
			funtion.login();
			break;
		case 4:
			System.out.println("bạn đã thoát khỏi chương trình!");
			return;
			}
		}
	}
}

	

