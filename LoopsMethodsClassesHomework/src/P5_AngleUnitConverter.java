import java.util.Scanner;


public class P5_AngleUnitConverter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String input = "";
		 String measure = "";
		 for(int i = 0; i<=n;i++){
			 input = in.nextLine();
			 input = input.replaceAll("\\s+", "");
			 measure = input.replaceAll("\\d+", "");
			 measure = measure.replace(".", "");
			 input = input.replaceAll("[^0-9.,]+", "");
			 
			 if (measure.equals("deg")) {
				 System.out.format("%.6f rad%n",
						 convertToRadians(Double.parseDouble(input)));
			 }
			 else if (measure.equals("rad")) {
				 System.out.format("%.6f deg%n",
						 convertToDegrees(Double.parseDouble(input)));
			 }
		 }
	}
	private static double convertToRadians(double value) {
		double result = Math.toRadians(value);
		return result;
	}
	private static double convertToDegrees(double value) {
		double result = Math.toDegrees(value);
		return result;
	}

}
