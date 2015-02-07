import java.util.Scanner;


public class P03_WeirdStrings {
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String line = input.nextLine().replaceAll("[\\\\/\\(\\)|\\s+]*","");
		String[] words = line.split("[^a-zA-z]+");
		
		int tempSum = 0;
		int firstPos = 0;
		int secondPos = 0;
		
		for (int i = 0; i < words.length - 1; i++){
			int currentWordsSum = 0;
			
			String concatWords = words[i] + words[i + 1];
			concatWords = concatWords.toLowerCase();
			for (int j = 0; j < words[i + 1].length(); j++) {
				currentWordsSum += concatWords.charAt(j)-96;
			}
			if (currentWordsSum >= tempSum){
				tempSum = currentWordsSum;
				firstPos = i;
				secondPos = i + 1;
			}
		}
		System.out.println(firstPos);
		System.out.println(secondPos);		
	}

}
