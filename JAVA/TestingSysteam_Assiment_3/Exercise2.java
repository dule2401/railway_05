package TestingSysteam_Assiment_3;

import java.time.LocalDate;
import java.util.Scanner;



public class Exercise2 {
	public class Account {
		short accountID;
		String email;
		String username;
		String fullName;
		LocalDate createDate;
	}
	
	public static void main(String[] args) {
		
	
		
		
	
//	ise 2 (Optional): Default value
//	Question 1:
//	Không sử dụng data đã insert từ bài trước, tạo 1 array Account và khởi
//	tạo 5 phần tử theo cú pháp (sử dụng vòng for để khởi tạo):
//	 Email: "Email 1"
//	 Username: "User name 1"
//	 FullName: "Full name 1"
//	 CreateDate: now
	Scanner scanner = new Scanner(System.in);
	Account account[] = new Account[5];
	for (int i = 0; i < account.length; i++) {
		Account	accounts = new Account();
		account[i] = accounts;
		account[i].email="email" + (i+1);
		account[i].username = "username"+ (i+1);
		account[i].fullName = "fullname" + (i+1);
//		account[i].createDate = 
		System.out.println(account[i].email);
		System.out.println(account[i].fullName);
		System.out.println(account[i].username);

}
}
}
