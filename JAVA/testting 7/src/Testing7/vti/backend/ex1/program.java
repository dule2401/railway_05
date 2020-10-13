package Testing7.vti.backend.ex1;


import Testing7.vti.entity.ex1.Student;

public class program {

public static void question1() {
	
	Student studen1 = new Student(1,"anh",100000);
	Student studen2 = new Student(2,"du",100000);
	Student studen3 = new Student(3,"a",100000);
	Student[]studen = {studen1,studen2,studen3};
	Student.setCollege("đại học bách khoa hà nội");
	
	for (int i = 0; i < studen.length; i++) {
		System.out.println(studen[i].getId());
		System.out.println(studen[i].getName());
		System.out.println(studen[i].getCollege());
		
	}
}
public static void question2_1() {
	Student studen1 = new Student(1,"anh",100000);
	Student studen2 = new Student(2,"du",100000);
	Student studen3 = new Student(3,"a",100000);
	Student[]studen = {studen1,studen2,studen3};
	Student.setCollege("đại học công nghệ");
	for (int i = 0; i < studen.length; i++) {
		System.out.println(studen[i].getId());
		System.out.println(studen[i].getName());
		System.out.println(studen[i].getCollege());
		}
}
public static void question2_2() {
	Student studen1 = new Student(1,"anh",100000);
	Student studen2 = new Student(2,"du",100000);
	Student studen3 = new Student(3,"a",100000);
	Student[]studen = {studen1,studen2,studen3};
	for (int i = 0; i < studen.length; i++) {
		System.out.println("các học viên đóng thêm 50k học phí: "+ (Student.getClassfound()+ 50000));
	}
	
	int x = ( studen1.getClassfound()+ studen2.getClassfound()+studen3.getClassfound());
	Student.setMoneyGroup(x);
	
	System.out.println(Student.getMoneyGroup());
	Student.setMoneyGroup(x - 50000);
	System.out.println(Student.getMoneyGroup());
	Student.setMoneyGroup(Student.getMoneyGroup()-20000);
	System.out.println(Student.getMoneyGroup());
	Student.setMoneyGroup(Student.getMoneyGroup()-150000);
	System.out.println(Student.getMoneyGroup());

	
	System.out.println("quỹ lớp còn lại là: "+ Student.getMoneyGroup());
}
public static void question5() {
	System.out.println("số sinh viên được tạo ra là: ");
	System.out.println();


}
}
