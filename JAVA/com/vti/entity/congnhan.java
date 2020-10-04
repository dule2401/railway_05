package com.vti.entity;

import java.util.Scanner;

public class congnhan extends canbo {
	private byte bac;

	public byte getBac() {
		return bac;
	}

	
	public void input() {
		super.input();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập bậc của công nhân: ");
		bac = scanner.nextByte();
	}

	
	public void getInfor() {
		super.getInfor();
		System.out.println("Bậc  : " + bac);
	}
}
