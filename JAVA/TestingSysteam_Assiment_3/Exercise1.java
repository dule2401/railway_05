package TestingSysteam_Assiment_3;


import java.util.Random;
import java.util.Scanner;



public class Exercise1 {

	public static void main(String[] args) {
//		Question 1:
//			Khai báo 2 số lương có kiểu dữ liệu là float.
//			Khởi tạo Lương của Account 1 là 5240.5 $
//			Khởi tạo Lương của Account 2 là 10970.055$
//			Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra
//			Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra
		
		float a = 5240.5f;
		double b = 10970.055d;
		int a1 = (int) a;
		int b1 = (int) b;
		System.out.println(a1);
		System.out.println(b1);
		
//		Question 2:
//			Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm
//			có số 0 ở đầu cho đủ 5 chữ số)
		Random rd = new Random();
		 int x = rd.nextInt(100000); 
		 if (x > 9999) {
			 System.out.println(x);
			   }
		
//		 Question 3:
//			 Lấy 2 số cuối của số ở Question 2 và in ra.
//			 Gợi ý:
//			 Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
//			 Cách 2: chia lấy dư số đó cho 100

//	cách 1
		 String y = String.valueOf(x);
			System.out.println("Hai số cuối: " + y.substring(3));
	
// cách 2
		 System.out.println(x%100);
//		 Question 4:
//			 Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng		 
		 Question4();
	}
	public static void Question4 () {
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhập số a: ");
		int a = scanner.nextInt() ;
		System.out.print("nhập số b: ");
		int b = scanner.nextInt() ;
		if (b == 0){
			System.out.println("Nhập lại b với b khác 0");
		}
		float c = (float)a / b;
		System.out.println(c);
	}
}