import java.util.Scanner;


public class P1_SymmetricNumbersInRange {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a range to find all symmetric numbers within it (0 <= start <= end <= 999");
		
		int start = input.nextInt();
		int end = input.nextInt();
		
		if (start < 0 || start > end || end > 999) {
			System.out.println("Invalid input!");
			
		} 
		else {
			boolean found = false;
			for (int i = start; i <= end; i++) {
				if (i / 10 == 0) {
				System.out.print(i + " ");
				found = true;
				}
				else if (i / 100 == 0) {
					if (i % 10 == i / 10) {
						System.out.print(i + " ");
						found = true;
					}
				}
			    else if (i % 10 == i / 100) {
			    	System.out.print(i + " ");
			    	found = true;
			    }
			}
			
			if (!found) {
				System.out.println("There are no symmetric numbers in the range [" + start + ", " + end + "].");
			}
		}
	}

}
