import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;


public class P11_MostFrequentWord {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			
			String[] wordsArray;
			wordsArray = input.nextLine().toLowerCase().split("[\\W' ]+");
			
			Map<String, Integer> map = new TreeMap<>();
			TreeSet<String> set = new TreeSet<>();
			int maxCount = 1;
			
			for (String word : wordsArray) {
				set.add(word);
			}
			
			for (int i = 0; i < 2; i++) {
				for (String word : set) {
					int counter = 0;
					String currentWord = word;
					
					for (int j = 0; j < wordsArray.length; j++) {
						if (currentWord.equals(wordsArray[j])) {
							counter++;
						}
					}
					if (counter >= maxCount) {
						maxCount = counter;
						if (i > 0) {
							map.put(currentWord, counter);
						}
					}
				}
			}
			for (Map.Entry<String, Integer> entry : map.entrySet()) {
				String key = entry.getKey();
				int value = entry.getValue();
				System.out.printf("%s -> %d%n", key, value);
			}
		}
	}

}
