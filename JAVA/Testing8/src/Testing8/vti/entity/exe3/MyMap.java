package Testing8.vti.entity.exe3;

import java.util.HashMap;

public class MyMap {
	public static void main(String[] args) {
		HashMap<Integer, String> student = new HashMap<Integer, String>();
		student.put(1, "du");
		student.put(2, "anh");
		student.put(3, "ngáo");

		for (Integer i : student.keySet()) {
			System.out.println("key: " + i + " value: " + student.get(i));
		}
	}
}
