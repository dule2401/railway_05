package Testing8.vti.entity.exe4;

public class MyNumber<N extends Number> {
	private N number;

	public MyNumber(N number) {
		super();
		this.number = number;
	}

	@Override
	public String toString() {
		return "MyNumber [number=" + number + "]";
	}
	
	
}
