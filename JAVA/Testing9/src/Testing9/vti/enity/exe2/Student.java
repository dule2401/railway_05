package Testing9.vti.enity.exe2;

public class Student {
 private int id = 0;
 private String name;
 
 

public Student(String name) {
	this.name = name;
}

public void id() {
	id++;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
	}
 public String getId1() {
	 return ("msv : " + id);
 }
 
}
