package Testing8.vti.backend;

import Testing8.vti.entity.exe3.Employee;
import Testing8.vti.entity.exe3.Phone;
import Testing8.vti.entity.exe3.Student;

public class Generic {
	public void question1() {

		Student<Integer> student1 = new Student<Integer>(1, "du");
		Student<Float> student2 = new Student<Float>(2f, "anh");
		Student<Double> student3 = new Student<Double>(3d, "ngáo");
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
	}

	public void question4() {
		Integer[] Int = { 5, 10, 15 };
		Float[] Float = { 6f, 5f, 15f };
		Double[] Double = { 5.2, 2.6, 6.9 };
		System.out.println(Int);
		System.out.println(Float);
		System.out.println(Double);
	}

	public void question5_1() {
		Integer[] salary1 = { 1000, 1200, 1200 };
		Employee<Integer> employee1 = new Employee<Integer>(1, "du", salary1);
		System.out.println(employee1);
	}

	public void question5_2() {
		Float[] salary2 = { 1000f, 2000f };
		Employee<Float> employee2 = new Employee<Float>(1, "du", salary2);
		System.out.println(employee2);
	}

	public void question7() {
		Phone<String, String> email = new Phone<String, String>("dule737@gmail.com", "0942736228");
		System.out.println(email);
		Phone<Integer, String> id = new Phone<Integer, String>(1, "0942736228");
		System.out.println(id);
		Phone<String, String> name = new Phone<String, String>("du", "0942736228");
		System.out.println(name);
	}
}