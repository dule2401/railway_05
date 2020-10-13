package Testing7.vti.entity.ex1;

public class Student {
private int id;
private String name;
static String college;
private static int classfound;
static int moneyGroup;
public Student() {
}

public Student(int id, String name, int classfound) {
	
	this.id = id;
	this.name = name;
	this.classfound = classfound;
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
public static String getCollege() {
	return college;
}
public static void setCollege(String college) {
	Student.college = college;
}

public static int getClassfound() {
	return classfound;
}

public void setClassfound(int classfound) {
	this.classfound = classfound;
}

public static int getMoneyGroup() {
	return moneyGroup;
}

public static void setMoneyGroup(int moneyGroup) {
	Student.moneyGroup = moneyGroup;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", getId()=" + getId() + ", getName()=" + getName()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}







}
