package Testing5.vti.entity.exe2.question3;

public class HinhChuNhat {
	private int a;
	private int b;
	
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public HinhChuNhat(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public String toString() {
		return "HinhChuNhat [a=" + a + ", b=" + b + "]";
	}

	public float tinhChuVi(float a, float b) {
		return (a + b) * 2;
	}

	public float tinhDienTich(float a, float b) {
		return a * b;
	}
}
