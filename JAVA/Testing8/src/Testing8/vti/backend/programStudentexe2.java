package Testing8.vti.backend;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import Testing8.vti.entity.exe2.studentexe2;

public class programStudentexe2 {

	List<studentexe2> students = new ArrayList<studentexe2>();

	public void ArrayListStudent() {

		students.add(new studentexe2(1, "du", LocalDate.parse("1997-8-05"), 10));
		students.add(new studentexe2(2, "anh", LocalDate.parse("1997-8-05"), 9));
		students.add(new studentexe2(3, "ngáo", LocalDate.parse("1997-8-05"), 10));
		students.add(new studentexe2(4, "ngơ", LocalDate.parse("1997-8-05"), 8));
		students.add(new studentexe2(5, "ghét", LocalDate.parse("1997-8-05"), 7));
	}

public void sortname() { 
	
	Collections.sort(List<students>);
	for (studentexe2 studentexe2 : students) {
		System.out.println(studentexe2);
	}

}

}
