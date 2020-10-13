package Testing6.vti.entity;

public class Department {
int id;
String name;
public Department() {
	
}

public Department(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

@Override
public String toString() {
	return "Department [id=" + id + ", name=" + name + "]";
}

}
