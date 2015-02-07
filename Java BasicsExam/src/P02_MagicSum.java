import java.util.ArrayList;
import java.util.Scanner;


public class P02_MagicSum {
	static Scanner read = new Scanner(System.in);
	public static void main(String[] args) {
		
		int d = read.nextInt();
		read.nextLine();
		ArrayList<Integer> numbers = new ArrayList<>();
		int maxSum = Integer.MIN_VALUE;
		int sum = 0;
		
		while (true){
			String input = read.nextLine();
			if (input.equals("End")){
				break;
			}
			numbers.add(Integer.parseInt(input));
					
		}
		if ( numbers.size()>2){
			int [] indexes = new int[3];
			 for (int i = 0; i < numbers.size(); i++){
				boolean isFound = false;
				for (int j = i +1; j < numbers.size(); j++){
					for (int j2 = j +1; j2 < numbers.size(); j2++){
						int sum1 = numbers.get(i) + numbers.get(j) + numbers.get(j2);
						if ( sum1 > maxSum && sum1%d == 0){
							maxSum = sum1;
							indexes[0] = numbers.get(i);
							indexes[1] = numbers.get(j);
							indexes[2] = numbers.get(j2);
							isFound = true;
							}
					}
				}
				if (!isFound){
					System.out.println("No");
				}
				else{
					System.out.println("%d + %d + %d" );
				}
			 }						 
		}
			 
		
	}
	
}

