import java.util.Scanner;


public class P06_CountSpecifiedWord {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] text = in.nextLine().toLowerCase().split("\\W+");
		String word = in.nextLine().toLowerCase();
		
		int count = countWord(text, word);
		System.out.println(count);
	}
	private static int countWord(String[] text, String word) {
		int count = 0;
		for(int i = 0; i<text.length; i++){
			if(text[i].equals(word)){
				count ++;
			}
		}
		return count;
	}
}
