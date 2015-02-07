import java.util.Scanner;
import java.util.TreeMap;


public class P04_ActivityTracker {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		TreeMap<Integer,TreeMap<String,Integer>> info = new TreeMap<>();
		
		
		for (int i = 0; i < n; i++ ){
			String[]line = input.nextLine().trim().split("[\\/ ]+");
			int mounth = Integer.parseInt(line[1]);
			String name = line[3];
			int distance = Integer.parseInt(line[4]);
			if (!info.containsKey(mounth)){
				info.put(mounth, new TreeMap<String,Integer>());
			}
			TreeMap<String,Integer> personInfo = info.get(mounth);
			int oldDistance = 0;
			
			if (personInfo.containsKey(name)){
				oldDistance = personInfo.get(name);
				
			}
			personInfo.put(name, oldDistance + distance);			
		}
		for (Integer mounth : info.keySet()){
			System.out.print(mounth + ": ");
			System.out.println(info.get(mounth).toString().replace("{","").
					replace("=", "(").replace(",", "),").replace("}", ")"));
		}
	}

}
