import java.util.Scanner;


public class P07_CountSubstringOccurrences {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inputText = in.nextLine().toLowerCase();
		String searchFor = in.nextLine().toLowerCase();
		
		int count = countSubstring(inputText, searchFor);
		System.out.println(count);
	}

	private static int countSubstring(String inputText, String searchFor) {
		int count = 0;
		for(int i = 0; i<=inputText.length()- searchFor.length();i++){
			if (inputText.substring(i,i+ searchFor.length()).equals(searchFor)) {
				count++;
			}
		}
		return count;
	}
}
