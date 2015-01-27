import java.util.Scanner;


public class PointsInsideTheHouse {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			double coordX = input.nextDouble();
			double coordY = input.nextDouble();
			
			Boolean cond01 = (coordX >= 12.5) && (coordX <= 17.5)
					&& (coordY >= 8.5) && (coordY <= 13.5);
					Boolean cond02 = (coordX >= 20) && (coordX <= 22.5)
					&& (coordY >= 8.5) && (coordY <= 13.5);
					
					double p1x = 12.5;
					double p1y = 8.5;
					double p2x = 22.5;
					double p2y = 8.5;
					double p3x = 17.5;
					double p3y = 3.5;
					
					double alpha = ((p2y - p3y) * (coordX - p3x) + (p3x - p2x)
							* (coordY - p3y))
							/ ((p2y - p3y) * (p1x - p3x) + (p3x - p2x) * (p1y - p3y));
					double beta = ((p3y - p1y) * (coordX - p3x) + (p1x - p3x)
							* (coordY - p3y))
							/ ((p2y - p3y) * (p1x - p3x) + (p3x - p2x) * (p1y - p3y));
					double gamma = 1.0f - alpha - beta;
					
					Boolean cond03 = (alpha >= 0) && (beta >= 0) && (gamma >= 0);

					if (cond01 || cond02 || cond03) {
						System.out.println("Inside");
					} 
					else {
						System.out.println("Outside");
					}
			}
							
	}

}
