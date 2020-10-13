package Testing7.vti.entity.exe2;

public class Studen {
 private final int id = 1;
 private String name;
public Studen(String name) {
	
	this.name = name;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public  static void study() {
	 System.out.println("đang học bài");
 }
}
