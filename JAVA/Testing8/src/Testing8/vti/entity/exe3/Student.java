package Testing8.vti.entity.exe3;

public class Student<T> {
	private T id;
	private String name;

	public Student(T id, String name) {

		this.id = id;
		this.name = name;
	}

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public <T1, T2> void print(T1 id, T2 name) {
		System.out.print(id);
		System.out.print(name);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
