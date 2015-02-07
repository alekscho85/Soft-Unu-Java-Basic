import java.util.Scanner;


public class P01_CountBeers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int totalBeers = 0;
		
		while (true){
			String orderLine = input.nextLine();
			if (orderLine.equals("End")) {
				break;
			}
			String[] order = orderLine.split(" ");
			int beers = Integer.parseInt(order[0]);
			
			if (order[1].equals("stacks")) {
				beers *= 20;
			}
			totalBeers += beers;
		
		}
		int stacks = totalBeers / 20;
		int beers = totalBeers % 20;
		
		System.out.println(stacks + " stacks + " + beers + " beers");
	}
}

