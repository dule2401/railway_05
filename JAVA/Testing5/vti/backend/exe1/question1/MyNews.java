package Testing5.vti.backend.exe1.question1;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import Testing5.vti.entity.exe1.question1.News;
// question 1
public class MyNews   {
	private static List<News> newsList;

	public MyNews() {
		ArrayList<News> newsList = new ArrayList<>();
	}
	public void insertNews() {

	News news = new News();
	int[] rates = new int[3];
	Scanner scanner = new Scanner(System.in);
	System.out.println("hãy nhập 3 đánh giá");
	for (int i = 0; i < rates.length; i++) {
		
		System.out.println("đánh giá thứ "+(i+1)+"là: ");
		rates[i] = scanner.nextInt();
		}
	}
	public static void viewListNews() {
		for (News news : newsList) {
			news.Display();
		}
	}
	public  void averageRate() {
		for (News news : newsList) {
			System.out.println("Title: " + news.getTitle() + " /n Average Rate: " + news.Calculate());
		}
	}

}

	

	
