package Testing5.vti.entity.exe2.question1;

public class Student1  implements IStudent {
	private int id;
	private String name;
	private int group;
	
	public Student1(int id, String name, int group) {
		super();
		this.id = id;
		this.name = name;
		this.group = group;
	}
	public void diemdanh() {
		System.out.println(name+"đã điểm danh");
	}
	public void hocbai() {
		System.out.println(name+"đang nộp bài");
	}
	public void donvesinh() {
		System.out.println(name+"đang dọn vệ sinh");
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
	public int getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", group=" + group + "]";
	}

}