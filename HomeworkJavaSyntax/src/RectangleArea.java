import java.util.Scanner;


public class RectangleArea {
	private static Scanner in;

	public static void main(String[] args) {
		int a, b, z;
		System.out.println("Eneter side a&b:");
		
		in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		z = a*b;
		System.out.println (z);
	}
}