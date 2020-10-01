package TestingSysteam_Assiment_3;

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Exercise4 {
	public static void main(String[] args) {
		
//	Question 1:
//		Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có
//		thể cách nhau bằng nhiều khoảng trắng );
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Nhập chuỗi: ");
	String n = scanner.nextLine();
	String[] soluongtu = n.split(" ");
	System.out.println("Số chữ: " + soluongtu.length);
//	Question 2:
//		Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;	

	System.out.println("Nhập chuỗi s1: ");
	String s1 = scanner.nextLine();
	System.out.println("Nhập chuỗi s2: ");
	String s2 = scanner.nextLine();
	System.out.println("nối chuỗi: " + s1+s2);
// Question 3:
// 		Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chưa
//	 	viết hoa chữ cái đầu thì viết hoa lên
	System.out.println("Nhập tên: ");
	String ten = scanner.nextLine();
	String chudautien = ten.substring(0, 1).toUpperCase();

	String chubentrai = ten.substring(1);
	ten = chudautien + chubentrai;
	System.out.println(ten);
// Question 4:
	// Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên
	// của người dùng ra
	// VD:
	// Người dùng nhập vào "Nam", hệ thống sẽ in ra
	// "Ký tự thứ 1 là: N"
	// "Ký tự thứ 1 là: A"
	// "Ký tự thứ 1 là: M"	
	System.out.println("Nhập tên bạn muốn in: ");
	String tennguoidung = scanner.nextLine();
	tennguoidung = tennguoidung.toUpperCase();
	for (int i = 0; i < tennguoidung.length(); i++) {
		System.out.println("ký tự thứ " + (i+1)+"là:" +tennguoidung.charAt(i)  );
	}
	
	// Question 5:
		// Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người
		// dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ

	System.out.println("nhập họ: ");
	String ho1 = scanner.nextLine();
	System.out.println("nhập tên: ");
	String ten1 = scanner.nextLine();
	System.out.println("tên đầy đủ của bạn là: " + ho1 +" "+ ten1);
	
//	Question 6:
//		Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
//		sau đó hệ thống sẽ tách ra họ, tên , tên đệm
//		VD:
//		Người dùng nhập vào "Nguyễn Văn Nam"
//		Hệ thống sẽ in ra
//		"Họ là: Nguyễn"
//		"Tên đệm là: Văn"
//		"Tên là: Nam"
	
	System.out.println("Nhập họ tên đầy đủ của bạn: ");
	String hoten = scanner.nextLine();
	
//	Question 7:
//		Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
//		chuẩn hóa họ và tên của họ như sau:
//		a) Xóa dấu cách ở đầu và cuối và giữa của chuỗi người dùng nhập
//		vào
//		3
//		VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ
//		chuẩn hóa thành "nguyễn văn nam"
//		b) Viết hoa chữ cái mỗi từ của người dùng
//		VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ
//		chuẩn hóa thành "Nguyễn Văn Nam"
	
	System.out.println("Nhập họ tên đầy đủ");
	String fullName = scanner.nextLine();
	fullName = fullName.trim();
	fullName = fullName.replaceAll("\\s+", " ");
	String[] words = fullName.split(" ");
	fullName = " ";
	for (String word : words) {
		String firstCharacter = word.substring(0, 1).toUpperCase();
		String leftCharacter = word.substring(1);
		word = firstCharacter + leftCharacter;

		fullName += word + " ";
	}

	System.out.println("Họ tên : " + fullName);


//	Question 8:
//		In ra tất cả các group có chứa chữ "Java"
	String[] ten_group = {"java khó","java khó vãi","java khó vãi đái"};
	for (int i = 0; i < ten_group.length; i++) {
		if (ten_group.equals("java")) {
			System.out.println(ten_group);
		}
	}
	
//	Question 9:
//		In ra tất cả các group "Java"
	
	String[] ten_group_2 = {"java khó","sql dễ ","java khó vãi đái"};
	for (int i = 0; i < ten_group_2.length; i++) {
		if (ten_group.equals("java")) {
			System.out.println(ten_group_2);
		}
	}
	
//	Question 10 (Optional):
//		Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không.
//		Nếu có xuất ra “OK” ngược lại “KO”.
//		Ví dụ “word” và “drow” là 2 chuỗi đảo ngược nhau.
	
	
// Question 11: Count special Character
// Tìm số lần xuất hiện ký tự "a" trong chuỗi
			System.out.println("Mời bạn nhập vào một chuỗi: ");
			String input = scanner.nextLine();
			int countinput = 0;
			for (int i = 0; i < input.length(); i++) {
				if ('a' == input.charAt(i)) {
					countinput++;
				}
			}

			System.out.println(countinput);
			
//			Question 12 (Optional): Reverse String
//			Đảo ngược chuỗi sử dụng vòng lặp
	
			System.out.println("Nhập chuỗi 1");
			String s = scanner.nextLine();
			String y = " ";
			for (int i = s.length() - 1; i >= 0; i--) {
				y += s.charAt(i);
			}
			System.out.println(y);
			
			

//			Question 15 (Optional): Revert string by word
//			Đảo ngược các ký tự của chuỗi cách nhau bởi dấu cách mà không dùng
//			thư viện.
//			Ví dụ: " I am developer " => "developer am I".
//			Các ký tự bên trong chỉ cách nhau đúng một dấu khoảng cách.
//			Gợi ý: Các bạn cần loại bỏ dấu cách ở đầu và cuối câu, thao tác cắt
//			chuỗi theo dấu cách

			 String inputs ="";
			  System.out.println("Nhap chuoi can dao nguoc");
			  try{
			   BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			   inputs = bufferedReader.readLine();
			   char []stt = inputs.toCharArray();
			   for(int i =stt.length-1 ;i>=0;i--){
			    System.out.print(stt[i]);
			   }
			     }catch(IOException e){
			     }

	
	
	}
}
