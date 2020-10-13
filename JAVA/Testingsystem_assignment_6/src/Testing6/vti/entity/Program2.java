package Testing6.vti.entity;
import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		try {
			float result = divide(7,0);
			System.out.println(result);
			
		} catch (Exception e) {
			System.out.println("cannot divide 0");
			
		}
		
		
		
	}

	 public static float divide(int a, int b) {

		return a/b;
	}

}

