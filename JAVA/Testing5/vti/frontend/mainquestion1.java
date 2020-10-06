package Testing5.vti.frontend;

import java.util.Scanner;

import Testing5.vti.backend.exe1.question1.MyNews;

public class mainquestion1 {
	MyNews myNews = new MyNews();
	Scanner scanner = new Scanner(System.in);

	int choose;
	do {
		System.out.println("=========MENU=========");
		System.out.println("==1. Insert news    ==");
		System.out.println("==2. View list news ==");
		System.out.println("==3. Average rate   ==");
		System.out.println("==4. Exit           ==");
		System.out.println("======================");
		System.out.println("==Bạn chọn:           ");
		choose = scanner.nextInt();

		switch (choose) {

		case 1:
			myNews.insertNews();
			break;

		case 2:
			MyNews.viewListNews();
			break;

		case 3:
			MyNews.
			MyNews.viewListNews();
			break;

		case 4:
			break;

		default:
			System.out.println("Nhập sai ! Vui lòng nhập lại !");
			break;
		}
	} while (choose != 4);


}
