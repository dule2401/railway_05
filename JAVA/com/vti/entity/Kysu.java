package com.vti.entity;

import java.util.Scanner;

public class Kysu extends canbo {
	private String nganhDaoTao;

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	
	public void input() {
		super.input();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập ngành đào tạo: ");
		nganhDaoTao = scanner.nextLine();
	}

	
	public void getInfor() {
		super.getInfor();
		System.out.println("Ngành đào tạo  : " + nganhDaoTao);
	}
}
