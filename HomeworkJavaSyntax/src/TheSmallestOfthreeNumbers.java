import java.util.Arrays;
import java.util.Scanner;


public class TheSmallestOfthreeNumbers {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			double[] numbers = new double[3];
			for (int i = 0; i < 3; i++){
				numbers[i] = input.nextDouble();
			}
				Arrays.sort(numbers);

				if(numbers[0] == (int) numbers[0]){
					System.out.println((int)numbers[0]);
				}
				else{
					System.out.println(numbers[0]);
				}
		}
	}
}