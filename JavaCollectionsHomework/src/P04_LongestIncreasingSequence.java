
import java.util.Scanner;

public class P04_LongestIncreasingSequence {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] arr = in.nextLine().split(" ");
		
		int[] numbers = filIntArray(arr);
		int temp = 1;
		int counter = 1;
		int positionOfInt = 0;
		
		System.out.print(numbers[0]);
		
		for (int i = 1; i < arr.length; i++) {
			if (numbers[i] > numbers[i - 1]) {
				temp++;
				System.out.print(" " + numbers[i]);
			} else {
				temp = 1;
				System.out.println();
				System.out.print(numbers[i]);
			}
			if (temp > counter) {
				counter = temp;
				positionOfInt = i;
			}
		}
		System.out.println();
		printResult(numbers, counter, positionOfInt);
	}
	
private static void printResult(int[] numbers, int counter,
		int positionOfInt) {
			System.out.print("Longest: ");
		for (int j = 0; j < counter - 1; j++) {
			System.out.print(numbers[positionOfInt - counter + 1 + j] + " ");
		}
		System.out.println(numbers[positionOfInt]);
}

private static int[] filIntArray(String[] arr) {
		int[] numbers = new int[arr.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(arr[i]);
		}
		return numbers;
	}
}