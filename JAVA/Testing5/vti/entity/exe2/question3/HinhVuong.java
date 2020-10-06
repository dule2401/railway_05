package Testing5.vti.entity.exe2.question3;

public class HinhVuong extends HinhChuNhat {
	public HinhVuong(int a, int b) {
		super(a, b);
	}

	public float tinhChuVi(float a) {
		return super.tinhChuVi(a, a);
	}

	public float tinhDienTich(float a) {
		return this.tinhDienTich(a, a);
	}

}
