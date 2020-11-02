package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.ultis.Scannerultis;

/**
 * This class is . 
 * 
 * @Description: .
 * @author: LNDu
 * @create_date: Nov 2, 2020
 * @version: 1.0
 * @modifer: LNDu
 * @modifer_date: Nov 2, 2020
 */
public class Progam {
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		Funtion funtion = new Funtion();
		System.out.println("Moi ban nhap chuc nang muon su dung:\n" + "1: In ra danh sách các User trong  project theo id project\n"
				+ "2: Login\n" + "3: Thoat khoi chuong trinh\n ");

		while (true) {
			System.out.println("Mời bạn nhập chức năng : ");
			int choose  = Scannerultis.inputInt();

		switch (choose) {
			case 1:
				funtion.getuserbyid();
				
				break;
//			
			case 4:
				System.out.println("bạn đã thoát khỏi chương trình!");
				return;
				}
			}
		}
}
