import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P12_CardsFrequencies {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] cards = in.nextLine().split(" ");
		Map<String, Integer> collection = new LinkedHashMap<String, Integer>();
		fillCollection(cards, collection);
		printResult(cards, collection);
	}
	private static void printResult(String[] cards,
			Map<String, Integer> collection) {
		double percCards = (double)100 / cards.length;
		for (String face : collection.keySet()) {
			double percentage = percCards * collection.get(face);
			System.out.printf("%s -> %.2f%%\n", face, percentage);
		}
	}
	private static void fillCollection(String[] cards,
			Map<String, Integer> collection) {
		for (int i = 0; i < cards.length; i++) {
			String cardFace = cards[i].substring(0, cards[i].length() - 1);
			if (collection.containsKey(cardFace)) {
				int newValue = collection.get(cardFace) + 1;
				collection.put(cardFace, newValue);
			} 
			else {
				collection.put(cardFace, 1);
			}
		}
	}
}