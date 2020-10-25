package com.vti.ultis;

import java.util.Scanner;

/**
 * This class is . 
 * 
 * @Description: .
 * @author: LNDu
 * @create_date: Oct 24, 2020
 * @version: 1.0
 * @modifer: LNDu
 * @modifer_date: Oct 24, 2020
 */
public class Scannerutils {
	private static Scanner scanner = new Scanner(System.in);

	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Oct 24, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Oct 24, 2020
	 * @return
	 */
	public static int inputId() {
		while (true) {
			int id = inputInt("bạn phải nhập vào số");
			if (id > 0) {
				return id;
			}
			System.out.print("bạn phải nhập vào số lơn hơn 0, vui lòng nhập lại: ");
		}
	}

	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Oct 24, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Oct 24, 2020
	 * @return
	 */
	public static String inputName() {
		return inputString("hãy nhập vào tên lớn hơn 8 ký tự, vui lòng nhập lại:  ");
	}

	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Oct 24, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Oct 24, 2020
	 * @return
	 */
	public static int inputInt() {
		return inputInt("hãy nhập vào số , vui lòng nhập lại");
	}

	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Oct 24, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Oct 24, 2020
	 * @return
	 */
	public static String inputemail() {
		return inputemail("phải nhập chuỗi là email");
	}

	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Oct 24, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Oct 24, 2020
	 * @param errorMessage
	 * @return
	 */
	public static int inputInt(String errorMessage) {
		while (true) {
			try {
				return Integer.parseInt(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}

	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Oct 24, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Oct 24, 2020
	 * @param errorMessage
	 * @return
	 */
	public static float inputFloat(String errorMessage) {
		while (true) {
			try {
				return Float.parseFloat(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}

	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Oct 24, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Oct 24, 2020
	 * @param errorMessage
	 * @return
	 */
	public static double inputDouble(String errorMessage) {
		while (true) {
			try {
				return Double.parseDouble(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}

	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Oct 24, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Oct 24, 2020
	 * @param errorMessage
	 * @return
	 */
	public static String inputString(String errorMessage) {
		while (true) {
			String input = scanner.nextLine().trim();
			if (!input.isEmpty()) {
				return input;
			} else if (input.length() < 8) {
				System.err.println(errorMessage);
			}
		}
	}

	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Oct 24, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Oct 24, 2020
	 * @return
	 */
	public static int inputAge() {
		while (true) {
			int age = inputInt("Wrong inputing! hãy nhập vào số, vui lòng nhập lại .");

			if (age <= 0) {
				System.err.println("Wrong inputing! tuổi phải lớn hơn 0, vui long nhập lại .");

			} else {
				return age;
			}
		}
	}

	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Oct 24, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Oct 24, 2020
	 * @return
	 */
	public static int inputAgeGreaterThan18() {
		while (true) {
			int age = inputAge();

			if (age >= 18) {
				return age;

			} else {
				System.out.println("Wrong inputing! tuổi phải lớn hơn 18, vui lòng nhập lại.");
			}
		}
	}

	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Oct 24, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Oct 24, 2020
	 * @param errorMessage
	 * @return
	 */
	public static String inputemail(String errorMessage) {
		while (true) {
			String email = Scannerutils.inputString(errorMessage);
			if (email == null || !email.contains("@gmail.com")) {
				System.err.println(errorMessage);
			} else {
				return email;
			}
		}

	}

	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Oct 24, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Oct 24, 2020
	 * @param errorMessage
	 * @return
	 */
	public static String inputPassword(String errorMessage) {
		while (true) {
			String password = Scannerutils.inputString(errorMessage);
			if (password.length() < 6 || password.length() > 12) {
				System.err.println(errorMessage);
				continue;
			}

			boolean hasAtLeast1Character = false;

			for (int i = 0; i < password.length(); i++) {
				if (Character.isUpperCase(password.charAt(i)) == true) {
					hasAtLeast1Character = true;
					break;
				}
			}
			if (hasAtLeast1Character == true) {
				return password;
			} else {
				System.err.println(errorMessage);
			}
		}
	}

}
