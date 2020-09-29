package TestingSystem_Assignment_2;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		
	//	Question1();
System.out.println();
	//	Question2();
System.out.println();
	//	Question3();
System.out.println();
	//	Question6();
	//	Question5();
		Question8();
	}
//	Question 1:
//	Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình
	public static void Question1 () {
		Scanner interger = new Scanner (System.in);
		int[] numbers = new int[3];
		System.out.println("Mời bạn nhập 3 số nguyên: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Mời bạn nhập số nguyên thứ "+ (i+1)+ ": ");
			numbers[i] = interger.nextInt();
		}
		System.out.print("Các sỗ nguyên bạn vừa nhập là: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]+",");
			
		}
		
	}
	
//	Question 2:
//		Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình
	public static void Question2() {
		Scanner floats = new Scanner (System.in);
		float[] numbers = new float[2];
		System.out.println("Mời bạn nhập 2 số thực : ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Mời bạn nhập số thực thứ "+ (i+1)+ ": ");
			numbers[i] = floats.nextFloat();
		}
		System.out.print("Các sỗ thực bạn vừa nhập là: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]+",");
	}
	}
	//Question 3:
	//	Viết lệnh cho phép người dùng nhập họ và tên
	public static void Question3() {
	
		Scanner scanner = new Scanner (System.in);
		System.out.println("mời bạn nhập họ : ");
		String ho = scanner.next();
		System.out.println("mời bạn nhập tên : ");
		String ten = scanner.next();
		System.out.println("họ tên bạn vừa nhập là : "+ ho +" "+ ten);
	}
//		Question 4:
//			Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ
//	public static void Question4 () {
//		Scanner birthday = new Scanner (System.in);
//		System.out.println("Hãy nhập vào ngày sinh của bạn: ");
//		String birthdayyou = birthday.next();
//		String DATE_FORMAT  = "dd/MM/yyyy";
//		SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
//		Date date = dateFormat.parse(birthdayyou);
//		System.out.println("Ngày sinh của bạn là : "+ date);
//}
//	Question 5:
//		Viết lệnh cho phép người dùng tạo account (viết thành method)
//		Đối với property Position, Người dùng nhập vào 1 2 3 4 5 và vào
//		chương trình sẽ chuyển thành Position.Dev, Position.Test,
//		Position.ScrumMaster, Position.PM
	public static void Question5 () {
		Scanner Scanner = new Scanner (System.in);
		System.out.println("Nhap vao Account ID:");
		int accountid = Scanner.nextInt();
		System.out.println("Nhap vao Department ID:");
		int department = Scanner.nextInt();
		System.out.println("Nhập vào email của bạn : ");
		String email = Scanner.nextLine();
		System.out.println("Nhập vào usernames của bạn : ");
		String usernames = Scanner.nextLine();
		System.out.print("Nhập vào số positionid :");
		int i = Scanner.nextInt(6);
		switch (i) {
		case 1:
			System.out.print("position.Dev");
			break;
		case 2:
			System.out.print("position.Test"); 
			break;
		case 3:
			System.out.print("position.ScrumMaster");
			break;
		case 4:
			System.out.print("position.PM");
			break;
		default:
			System.out.print("position.SA");
		}


	}
//	Question 6:
//		Viết lệnh cho phép người dùng tạo department (viết thành method)
	public static void Question6 () {
		Scanner Scanner = new Scanner(System.in);
		System.out.print("Hãy nhập tên department mới :");
		String department = Scanner.nextLine();
	}
//	Question 7:
//		Nhập số chẵn từ console
	public static void Question7 () {
		Scanner Scanner = new Scanner(System.in);
		int i = Scanner.nextInt();
			 if (i % 2 == 0) {
				System.out.print("số bạn vừa nhập là :" + i);
			 }
				else {
				System.out.println("vui lòng nhập lại");
			}
		}
// Question 8:viết chương trình thực hiện theo flow sau:
//	Bước 1:
//		Chương trình in ra text "mời bạn nhập vào chức năng muốn sử
//		dụng"
//		Bước 2dụng:
//		Nếu người dùng nhập vào 1 thì sẽ thực hiện tạo account
//		Nếu người dùng nhập vào 2 thì sẽ thực hiện chức năng tạo
//		department
//		Nếu người dùng nhập vào số khác thì in ra text "Mời bạn nhập
//		lại" và quay trở lại bước 1
	public static void Question8 () {	
	Scanner Scanner = new Scanner(System.in);
	
	System.out.print("mời bạn nhập vào chức năng muốn sử dụng : ");
	int z = Scanner.nextInt(3);
	switch (z) {
	case 1:{
		System.out.println("Nhap vao Account ID:");
		int accountid = Scanner.nextInt();
		System.out.println("Nhap vao Department ID:");
		int department = Scanner.nextInt();
		System.out.println("Nhập vào email của bạn : ");
		String email = Scanner.nextLine();
		System.out.println("Nhập vào usernames của bạn : ");
		String usernames = Scanner.nextLine();
		System.out.print("Nhập vào số positionid :");
		int i = Scanner.nextInt(6);
		switch (i) {
		case 1:
			System.out.print("position.Dev");
			break;
		case 2:
			System.out.print("position.Test"); 
			break;
		case 3:
			System.out.print("position.ScrumMaster");
			break;
		case 4:
			System.out.print("position.PM");
			break;
		default:
			System.out.print("position.SA");
		}
	}
	break;
	case 2: {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hãy nhập tên department mới :");
		String department = scanner.nextLine();
		}
		break;
	default:
		System.out.println("Mời bạn nhập lại : ");
		break;
	}
}
// Question 9:
//	Viết method cho phép người dùng thêm account vào group theo flow sau:
//		Bước 1:
//		In ra tên các usernames của user cho người dùng xem
//		Bước 2:
//		Yêu cầu người dùng nhập vào username của account
//		Bước 3:
//		In ra tên các group cho người dùng xem
//		Bước 4:
//		Yêu cầu người dùng nhập vào tên của group
//		Bước 5:
//		Dựa vào username và tên của group người dùng vừa chọn, hãy
//		thêm account vào group đó .
	public static void Question9 () {
		Scanner user = new Scanner(System.in);
		String usernames = user.nextLine();
		System.out.println("danh sách các user là: " + usernames);
		System.out.println("hãy nhập vào usernames bạn muốn chọn : ");
		String x = user.nextLine();
		String group =  user.nextLine();
		System.out.println("danh sách group là: "+ group);
		System.out.println("hãy nhập vào tên group: ");
		
		
	
	}
//	Question 10: Tiếp tục Question 8 và Question 9
//	Bổ sung thêm vào bước 2 của Question 8 như sau:
//	Nếu người dùng nhập vào 3 thì sẽ thực hiện chức năng thêm group vào
//	account
//	Bổ sung thêm Bước 3 của Question 8 như sau:
//	Sau khi người dùng thực hiện xong chức năng ở bước 2 thì in ra dòng
//	text để hỏi người dùng "Bạn có muốn thực hiện chức năng khác
//	không?". Nếu người dùng chọn "Có" thì quay lại bước 1, nếu người
//	dùng chọn "Không" thì 
	public static void 	Question10 () {
			Scanner Scanner = new Scanner(System.in);
			
			System.out.print("mời bạn nhập vào chức năng muốn sử dụng : ");
			int z = Scanner.nextInt(4);
			switch (z) {
			case 1:{
				System.out.println("Nhap vao Account ID:");
				int accountid = Scanner.nextInt();
				System.out.println("Nhap vao Department ID:");
				int department = Scanner.nextInt();
				System.out.println("Nhập vào email của bạn : ");
				String email = Scanner.nextLine();
				System.out.println("Nhập vào usernames của bạn : ");
				String usernames = Scanner.nextLine();
				System.out.print("Nhập vào số positionid :");
				int i = Scanner.nextInt(6);
				switch (i) {
				case 1:
					System.out.print("position.Dev");
					break;
				case 2:
					System.out.print("position.Test"); 
					break;
				case 3:
					System.out.print("position.ScrumMaster");
					break;
				case 4:
					System.out.print("position.PM");
					break;
				default:
					System.out.print("position.SA");
				}
			}
			break;
			case 2: {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Hãy nhập tên department mới :");
				String department = scanner.nextLine();
				}
				break;
			case 3:{
				
			}
				
			default:
				System.out.println("Mời bạn nhập lại : ");
				break;
		
			}
	}
	
	
}