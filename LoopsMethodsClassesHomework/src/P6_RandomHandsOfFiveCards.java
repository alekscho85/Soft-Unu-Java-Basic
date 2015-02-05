
import java.util.Random;
import java.util.Scanner;

public class P6_RandomHandsOfFiveCards {
public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	 int n = in.nextInt();
	 String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
	 char[] suit = { '♣', '♦', '♥', '♠' };
	 Random random = new Random();
	 
	 for (int i = 0; i < n; i++) {
		 for (int j = 0; j < 5; j++) {
			 int numberCard = random.nextInt(cards.length-1) + 1;
			 int numberSuit = random.nextInt(suit.length-1) + 1;
			 System.out.printf("%s%c ",cards[numberCard], suit[numberSuit]);
		 }
		 System.out.println();
	 }
			 
	 }
}
