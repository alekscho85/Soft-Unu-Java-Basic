import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;


public class P04_Orders {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer row = Integer.parseInt(scanner.nextLine());
		
		LinkedHashMap<String, TreeMap<String, Integer>> orders = new LinkedHashMap<String, TreeMap<String, Integer>>();
		
		
		for(int i =0; i < row; i++){
			String[] currentInpData = scanner.nextLine().split(" ");
			
			String currentCustomer = currentInpData[0];
			Integer currentQuatity = Integer.parseInt(currentInpData[1]);
			String currenProduct = currentInpData[2];
			
			if (!orders.containsKey(currenProduct)){
				TreeMap<String, Integer> newPurchas = new TreeMap<String, Integer>();
				newPurchas.put(currentCustomer, currentQuatity);
				
				orders.put(currenProduct, newPurchas);
			}
			else {
				TreeMap<String, Integer> currentPurchas = orders.get(currenProduct);
				
				if (!currentPurchas.containsKey(currentCustomer)) {
					currentPurchas.put(currentCustomer, currentQuatity);
					orders.put(currenProduct, currentPurchas);
				}
				else {
					currentPurchas = orders.get(currenProduct);
					Integer quantityInDatabase =currentPurchas.get(currentCustomer) + currentQuatity;
					
					currentPurchas.put(currentCustomer, currentQuatity);
					orders.put(currenProduct, currentPurchas);
				}
			}
			
		}
		for (String product : orders.keySet()) {
			
			String output = product + ": ";
			
			TreeMap<String, Integer> purchas = orders.get(product);
			
			
			for (String customer : purchas.keySet() ){
				Integer quantity = purchas.get(customer);
				output += customer + " " + quantity + ", ";
			}
			output = product + ": " + output.substring(0, output.length() - 2);
			
			System.out.println(output);
		}
	}

}
