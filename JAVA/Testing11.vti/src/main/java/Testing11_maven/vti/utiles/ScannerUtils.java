package Testing11_maven.vti.utiles;

import java.util.Scanner;

public class ScannerUtils {
	private static Scanner scanner = new Scanner(System.in);

	public static int inputId() {
		while (true) {
			int id = inputInt("bạn phải nhập vào số");
			if (id > 0) {
				return id;
			}
			System.out.println("bạn phải nhập vào số lơn hơn 0, vui lòng nhập lại");
		}
	}

	public static String inputName() {
		return inputString("hãy nhập vào tên lớn hơn 8 ký tự, vui lòng nhập lại ");
	}

	public static int inputInt() {
		return inputInt("hãy nhập vào số , vui lòng nhập lại");
	}

	public static int inputInt(String errorMessage) {
		while (true) {
			try {
				return Integer.parseInt(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}

	public static float inputFloat(String errorMessage) {
		while (true) {
			try {
				return Float.parseFloat(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}

	public static double inputDouble(String errorMessage) {
		while (true) {
			try {
				return Double.parseDouble(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}

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

}
