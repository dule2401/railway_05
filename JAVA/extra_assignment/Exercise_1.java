package extra_assignment;

import java.util.Scanner;
import java.io.*;

import java.math.*;
public class Exercise_1 {
	public static void main(String[] args) {
//	Question 1:
//		Viết chương trình nhập vào một số thực. Đơn vị tính cho số này là centimet
//		(cm).
//		Hãy in ra số tương đương tính bằng foot (số thực, có 2 số lẻ thập phân) và inch
//		(số thực, có 2 số lẻ thập phân).
//		Với 1 inch = 2.54 cm 1 inch = 2.54 cmvà 1 foot = 12 inches.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap cm : ");
		double cm = scanner.nextDouble();
		System.out.println("số inch bằng: " + cm/2.54);
		System.out.println("số foot bằng: " + 12*(cm/2.54));
		
///	Question 2:
//		Viết chương trình nhập vào số giây từ 0 tới 68399, đổi số giây này thành dạng
//		[giờ:phút:giây], mỗi thành phần là một số nguyên có 2 chữ số.
//		Ví dụ: 02:11:05	
		
		System.out.println("Nhap số second : ");
		int second =scanner.nextInt(68399);
		int hours = second / 3600;
		int minutes = (second % 3600) / 60;
		int seconds = second % 60;
		 
		System.out.format("%02d:%02d:%02d", hours, minutes, seconds);

//		Question 3:
//			Viết chương trình nhập vào 4 số nguyên.
//			Hiển thị ra số lớn nhất và nhỏ nhất
//			Ví dụ:
//			nhập vào 4 số 1,2,3,4 thì kết quả là:
//			Số lớn nhất là: 4
//			Số nhỏ nhất là: 1
		int[] numbers = new int[4];
		System.out.println("nhập vào 4 số nguyên");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("nhập số nguyên thứ " + (i+1) +":");
			numbers[i] = scanner.nextInt();
		}
		 int max = numbers[0];
		 int min = numbers[0];
		         
		    for (int i = 0; i < 4; i++) {
		        if (numbers[i] < min) {
		            min = numbers[i]; }
		            else  if (numbers[i] > max) {
		            max = numbers[i];
		        }
		    }
		        System.out.print("\n số nguyên nhỏ nhất là " + min);
		        System.out.print("\n số nguyên lớn nhất là là " + max);
//		  Question 4:
//		    Nhập vào hai số tự nhiên a và b. Tính hiệu của hai số đó.
//		   	Nếu hiệu số lớn hơn 0 thì in ra dòng chữ [Số thứ nhất lớn hơn số thứ
//		    hai].
//		    Nếu hiệu số nhỏ hơn 0 thì in ra dòng chữ [Số thứ nhất nhỏ hơn số thứ
//		    hai].ưs
		  System.out.println("nhập vào 2 số tự nhiên");
		  System.out.println("nhập số thứ a: ");
		  int a = scanner.nextInt();
		  System.out.println("nhập số thứ b: ");
		  int b = scanner.nextInt();
		  int subtract = a - b;
		  		System.out.println("hiệu của hai số là: "+ subtract);
		  if (subtract > 0) {
			System.out.println("Số thứ nhất lớn hơn số thứ hai");
		} else if (subtract < 0 ) {
			System.out.println("Số thứ nhất nhỏ hơn số thứ hai");
		}
		  
//		  Question 5:
//			  Nhập vào 2 số tự nhiên a và b. Kiểm tra xem a có chia hết cho b không
		  System.out.println("nhập vào 2 số tự nhiên");
		  System.out.println("nhập số thứ x: ");
		  int x = scanner.nextInt();
		  System.out.println("nhập số thứ y: ");
		  int y = scanner.nextInt();
		  int division = x/y;
		  if (division == 0) {
			System.out.println("x chia hết cho y");
		} else if (division != 0) {
			System.out.println("x không chia hết cho y");
		}
//		  Question 6:
//			  Xếp loại sinh viên theo các qui luật dưới đây:
//			  Nếu điểm >= 9.0 - Loại xuất sắc
//			  Nếu 8.0<= điểm < 9.0 - Loại giỏi
//			  Nếu 7.0<= điểm < 8.0 - Loại khá 
//			  2
//			  Nếu 6.0 <= điểm < 7.0 - Loại trung bình khá
//			  Nếu 5.0 <= điểm < 6.0 - Loại trung bình
//			  Nếu điểm < 5.0 - Loại kém
//			  Với điểm = ( (điểm toán)*2 + điểm lý + điểm hóa )/4
//			  Viết Chương trình:
//			  a. Nhập vào điểm 3 môn học
//			  b. Tính điểm trung bình
//			  c. Xác định học lực của học sinh dựa trên điểm trung bình
//			  d. Hiển thị học lực của học sinh
		  System.out.println("nhập vào điểm của 3 muôn học");
		  System.out.println("môn toán: ");
		  int toán = scanner.nextInt();
		  System.out.println("môn lý: ");
		  int lý = scanner.nextInt();
		  System.out.println("môn hóa: ");
		  int hóa = scanner.nextInt();
		  int sum = (toán*2 + lý + hóa)/4;
	      	System.out.println("điểm trung bình 3 môn là : " + sum);
	      	if (sum >= 9) {
				System.out.println("loại xuất sắc");
			} else if (sum >= 8 ) {
				System.out.println("loại giỏi");
			} else if(sum >= 7) {
				System.out.println("loại khá");
			} else if(sum >= 6) {
				System.out.println("loại trung bình khá");
			} else if(sum >= 5) {
				System.out.println("loại trung bình");
			} else if(sum < 5) {
				System.out.println("loại kém");
			}
		        
		        
		        
		        
	}
}	

