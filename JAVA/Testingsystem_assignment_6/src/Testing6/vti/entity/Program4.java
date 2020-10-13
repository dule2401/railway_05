package Testing6.vti.entity;

public class Program4 {
	public static void main(String[] args) {
		Arraydepartment();
	}

	public static void Arraydepartment() {
		Department[] department = new Department[3];
		try {
			for (int i = 0; i < department.length + 1; i++) {
				System.out.println(department.length);
			}
		} catch (Exception e) {
		System.out.println("sCannot find department.");
		}
		
		
	}

}
