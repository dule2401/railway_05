package TestingSystem_Assignment_2;

import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args) {
		// Question1();
		System.out.println();
		Question3();
	}
		public static void Question1 () {
			for (int i = 0; i < 10; i++) {
				if (i == 10) {
					continue;
				} else if (i % 2 == 0) {
					System.out.println(i);
				}
			}
		}
		public static void Question3 () {
			for (int j = 0; j < 10; j++) {
				System.out.println(j);
			}
			
		}
}