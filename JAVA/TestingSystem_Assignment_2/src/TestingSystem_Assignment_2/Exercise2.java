package TestingSystem_Assignment_2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise2 {
	public static void main(String[] args) {
//		Question 1:
//			Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số
//			nguyên đó	
		int x =2000000;
		System.out.println(x);
		
		
//		Question 2:
//			Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in
//			ra số nguyên đó thành định dạng như sau: 100,000,000
		int y = 100000000;
		System.out.format("%,d%n",y);
		
		
//		Question 3:
//			Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để in ra số
//			thực đó chỉ bao gồm 4 số đằng sau
		float z = (float)5.567098;
		System.out.printf("%.4f%n", z);
		
//		Question 4:
//			Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó theo định
//			dạng như sau:
//			Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau:
//			Tên tôi là "Nguyễn Văn A" và tôi đang độc thân
		String hoten = "Nguyễn Văn A";
		System.out.println("Tên tôi là : " +hoten+ " và tôi đang độc thân" );

//		Question 5:
//			Lấy thời gian bây giờ và in ra theo định dạng sau:
//			24/04/2020 11h:16p:20 
		Date date = new Date();
		String DATE_FORMAT  = "dd-MM-yyyy hh:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT );
		System.out.println(simpleDateFormat.format(date)); 
		
//		Question 6:
//			In ra thông tin account (như Question 8 phần FOREACH) theo định dạng
//			table (giống trong Database)
		
	
	}
}
