import java.util.Locale;
import java.util.Scanner;


public class PointInsideFigure {
	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Scanner in = new Scanner(System.in);
		
		double x = in.nextDouble();
		double y = in.nextDouble();
		
		if ((x>=12.5 && x<=22.5 && y>=6 && y<=8.5)
		||(x>=12.5 && x<=17.5 && y>=8.5 && y<=13.5)
		||(x>=20 && x<=22.5 && y>=8.5 && y<=13.5)){
		System.out.println("Inside");
		}
		else {
		System.out.println("Outside");
		}
	}
}
