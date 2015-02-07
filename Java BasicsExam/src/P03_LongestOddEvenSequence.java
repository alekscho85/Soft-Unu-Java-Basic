import java.util.ArrayList;
import java.util.Scanner;


public class P03_LongestOddEvenSequence {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<>();
		
		String str = input.nextLine().replaceAll("[()]","");
		
		String[] line = input.nextLine().trim().split("\\s+");
		
		for (int i =0; i < line.length; i++){
			numbers.add(Integer.parseInt(line[1]));
		}
		int count = 1;
		int maxCount = 1;
		boolean isZero = (numbers.get(0)==0);
		
		for (int i = 0; i < numbers.size(); i++){
			if (isZero && numbers.get(i)==0){
				isZero = true;
				count++;
				continue;
			}
			else {
				isZero = false;
			}
			if (numbers.get(i) ==0 && numbers.get(i+1) ==0){
				numbers.set(i, numbers.get(i-1)+1);
				numbers.set(i+1,numbers.get(i)+ 1);
			}
			if ( numbers.get(i-1)!=0 && numbers.get(i - 1)%2 ==0 && numbers.get(i) == 0){
				numbers.set(i,numbers.get(i)+ 1);
				count++;
			}
			else if (numbers.get(i)!=0 && numbers.get(i- 1)%2 !=0 && numbers.get(i) == 0){
				numbers.set(i,numbers.get(i)+ 1);				
			}
			
			if (count > maxCount){
				maxCount =count;
			}
			else {
				count =1;
			}
			
		}
		System.out.println(maxCount);
	}
}

	
