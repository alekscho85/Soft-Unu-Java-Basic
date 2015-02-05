import java.util.Scanner;


public class P02_SequencesOfEqualStrings {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] results = in.nextLine().split(" ");
		System.out.print(results[0]);
		for (int i = 1; i < results.length; i++) {
			if (results[i].equals(results[i - 1])) {
				 System.out.print(" " + results[i]);
			}
			else{
				System.out.println();
				System.out.print(results[i]);
			}
		}
	}

}
