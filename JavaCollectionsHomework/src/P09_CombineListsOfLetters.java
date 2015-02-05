import java.util.ArrayList;
import java.util.Scanner;


public class P09_CombineListsOfLetters {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Character> line1 = new ArrayList<Character>();
		ArrayList<Character> line2 = new ArrayList<Character>();
		
		fillArrayList(in, line1);
		fillArrayList(in, line2);
		
		combinedLists(line1, line2);
		for (int i = 0; i < line1.size(); i++) {
			System.out.print(line1.get(i));
		}
	}
	
	private static void combinedLists(ArrayList<Character> line1,
			ArrayList<Character> line2) {
		for (int i = 0; i < line2.size(); i++) {
			if (line1.contains(line2.get(i))) {
				continue;
			}
			else{
				line1.add(' ');
				line1.add(line2.get(i));
			}
		}
	}
	
	private static void fillArrayList(Scanner in,
			ArrayList<Character> line1) {
		for (char ch : in.nextLine().toCharArray()) {
			line1.add(ch);
		}
	}

}
