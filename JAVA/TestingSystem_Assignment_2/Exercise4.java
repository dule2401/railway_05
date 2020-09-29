package TestingSystem_Assignment_2;
import java.time.LocalDate;
import java.util.Random;

public class Exercise4 {
public static void main(String[] args) {
	
	// Question 1
	 // In ngẫu nhiên ra 1 số nguyên
	Random random = new Random();
	int x = random.nextInt();
	System.out.println(x);
	
	// Question 2:
	 // In ngẫu nhiên ra 1 số thực
	float y = random.nextFloat();
	System.out.println(y);
	
	// Question 3:
	//Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in ngẫu nhiên
	//ra tên của 1 bạn
	Hoten hoten1 = new Hoten();
	hoten1.id = 1;
	hoten1.hoten = "vũ văn ước";
	Hoten hoten2 = new Hoten();
	hoten2.id = 2;
	hoten2.hoten = "lê ngọc du";	
	Hoten hoten3 = new Hoten();
	hoten3.id = 3;
	hoten3.hoten = "nguyễn thế đức";
	Hoten hoten4 = new Hoten();
	hoten4.id = 4;
	hoten4.hoten = "nguyễn văn huy";
	Hoten[] hotens = {hoten1,hoten2,hoten3,hoten4};
	int a = random.nextInt(hotens.length);
	System.out.println(hotens[a].hoten);
	
	//Question 4:
	//Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày 20-12-
	//1995
	int minDay = (int) LocalDate.of(1995, 07, 27).toEpochDay();
	int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();
	
	long randomInt = minDay + random.nextInt(maxDay - minDay);
	LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
	System.out.println(randomDay);
	
	// Question 5:
	//Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây
	int z = random.nextInt(365);
	int maxDay1 = (int) LocalDate.now().toEpochDay();
	long randomInts = maxDay1 -z;
	LocalDate randomDays = LocalDate.ofEpochDay(randomInts);
	System.out.println(randomDays);
	
	// Question 6:
	// Lấy ngẫu nhiên 1 ngày trong quá khứ
	int i = random.nextInt(1000);
	int daynow = (int) LocalDate.now().toEpochDay();
	long past = maxDay1 -i;
	LocalDate randompasts = LocalDate.ofEpochDay(past);
	System.out.println(randompasts);
	
	
//	Question 7:
//		Lấy ngẫu nhiên 1 số có 3 chữ số
	int j = random.nextInt(999 - 100 + 1) + 100;
	System.out.println(j);
	

}
}
