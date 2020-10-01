package TestingSysteam_Assiment_3;

public class Exercise3 {
//	Question 1:
//		Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
//		Sau đó convert lương ra float và hiển thị lương lên màn hình (với số
//		float có 2 số sau dấu thập phân)
	public static void main(String[] args) {
		Integer x = 5000;
		System.out.printf("%2.2f",(float) x);

//	Question 2:
//		Khai báo 1 String có value = "1234567"
//		Hãy convert String đó ra số int
		String i = "1234567";
		int j =Integer.parseInt(i);
		System.out.println(j);
//		Question 3:
//			Khởi tạo 1 số Integer có value là chữ "1234567"
//			Sau đó convert số trên thành datatype int
		Integer a = 1234567 ;
		int b = a.intValue();
		System.out.println(b);
	}
}
