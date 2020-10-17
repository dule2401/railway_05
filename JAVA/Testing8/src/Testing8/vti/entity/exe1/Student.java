package Testing8.vti.entity.exe1;
//Question 1: List
//Tạo 1 student có property id, name (trong đó có 3 student có name
//trùng nhau, id sẽ là auto increment)
//Khai báo 1 ArrayList students, sau đó
//a) In ra tổng số phần tử của students
//b) Lấy phần tử thứ 4 của students
//c) In ra phần tử đầu và phần tử cuối của students
//d) Thêm 1 phần tử vào vị trí đầu của students
//e) Thêm 1 phần tử vào vị trí cuối của students
//f) Đảo ngược vị trí của students
//g) Tạo 1 method tìm kiếm student theo id
//h) Tạo 1 method tìm kiếm student theo name
//i) Tạo 1 method để in ra các student có trùng tên
//j) Xóa name của student có id = 2;
//k) Delete student có id = 5;
//l) Tạo 1 ArrayList tên là studentCopies và add tất cả students vào
//studentCopies

public class Student  {
	private static int counter =0;
	private int id;
	private String name;
	
	public Student(int id , String name) {
		counter ++;
		this.id = id;
		this.name = name;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public static int getCounter() {
		return counter;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		String result = "";
		result += "ID là: " + id + " Tên học sinh là: " + name + "\n";
		return result;
	}
}

