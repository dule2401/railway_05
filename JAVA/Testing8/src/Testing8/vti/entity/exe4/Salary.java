package Testing8.vti.entity.exe4;

public class Salary<N extends Number> {
	private N salary;

	public Salary(N salary) {
		super();
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Salary [salary=" + salary + "]";
	}

}
