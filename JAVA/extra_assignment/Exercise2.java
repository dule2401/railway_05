package extra_assignment;
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
public class Exercise2 {
	
//		Question 1:
//			Nhập số liệu cho dãy số thực a0 , a1 ,..., an-1 .
//			Hãy liệt kê các phần tử xuất hiện trong dãy đúng một lần
		
//	Scanner scanner = new Scanner(System.in);
//	 System.out.print("Nhập số phần tử của mảng: ");
//     int n = scanner.nextInt();
//     // khởi tạo arr
//     int [] arr = new int [n];
//     System.out.println("Nhập các phần tử của mảng: ");
//     for (int i = 0; i < n; i++) {
//         System.out.printf("a[%d] = ", i);
//         arr[i] = scanner.nextInt();
//     }
//     // tìm số lần xuất hiện của các phần tử
//     Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
//     for (int i = 0; i < n; i++) {
//     addElement(map, arr[i]);
//     }
//     System.out.print("Các phần tử xuất hiện 1 lần: ");
//     for (Integer key : map.keySet()) {
//         if (map.get(key) == 1) {
//             System.out.print(key + " ");
//         }
//     }
		
//		Question 4:
//			Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ.
//			Ví dụ: Số 8545604 có tổng các chữ số là: 8+5+4+5+6+0+4= 32

		  public static int nhap(){
		 Scanner input= new Scanner(System.in); 
		 boolean check= false;
		 int n=0; 
		 while(!check){
		 System.out.print(" "); 
		 try{
		 n= input.nextInt(); 
		 check= true;
		 } catch(Exception e){
		 System.out.println("Ban phai nhap so! hay nhap lai..."); 
		 input.nextLine();
		 }
	}
		return (n);
	}
		 public static int tinhTong(long i){ 
		 int sum=0;
		 long n; 
		while(i!=0){
		n= i%10;
		       sum+= n; i/=10;
		        }
		 return (sum);
	}
		 public static void main(String[] args){ 
		          System.out.print("Nhap n");
		              int n= nhap();
		              System.out.println("Tong cua so "+n+" = " +tinhTong(n));
	
}
		 
}
