import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class P08_ExtractEmail {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String text = in.nextLine().toLowerCase();
		String regex = ("[\\w-+]+(?:\\.[\\w-+]+)*@(?:[\\w-]+\\.)+[a-zA-Z]{2,7}");
		Pattern emailPattern = Pattern.compile(regex);
		Matcher matcher = emailPattern.matcher(text);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}

}
