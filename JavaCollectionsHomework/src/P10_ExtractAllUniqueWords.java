import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class P10_ExtractAllUniqueWords {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] words =in.nextLine().toLowerCase().split("\\W+");
		
		Set<String> set = new HashSet<String>(Arrays.asList(words));
		words = (String []) set.toArray(new String[set.size()]);
		Arrays.sort(words);
		for(String item : words){
			System.out.print(item + " ");
		}
	}

}
