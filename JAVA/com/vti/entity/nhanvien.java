package com.vti.entity;

import java.util.Scanner;

public class nhanvien extends canbo{

	private String congViec;

	public String getCongViec() {
		return congViec;
	}

	@Override
	public void input() {
		super.input();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập công việc: ");
		congViec = scanner.nextLine();
	}

	@Override
	public void getInfor() {
		super.getInfor();
		System.out.println("Công việc  : " + getCongViec());
	}

}


