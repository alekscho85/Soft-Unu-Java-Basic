import java.util.ArrayList;
import java.util.Scanner;

//import org.apache.commons.lang.time.StopWatch;

public class P04_InsertionSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        String[] numbers = scan.nextLine().replace("[", "").replace("]", "").split(", ");
        ArrayList<Integer> numbersArr = new ArrayList<Integer>();

        //TODO: Parse the numbers and add them to the list
        for (String num : numbers) {
        	numbersArr.add(Integer.parseInt(num));
        	}
        //        StopWatch stopWatch = new StopWatch();
        //        stopWatch.start();

        //TODO: Write the sorting algorithm that you use for sorting the List's elements
        int key;
        int i;
        for (int j = 1; j < numbersArr.size(); j++) {
        	key = numbersArr.get(j);
        	for (i = j - 1; (i >= 0) && (numbersArr.get(i) > key); i--) {
        		numbersArr.set((i + 1), numbersArr.get(i));
        	}
        	numbersArr.set((i + 1), key);
        }
        
        //        stopWatch.stop();
        //        long time = stopWatch.getTime();

        System.out.println(numbersArr);
        //        System.out.println(time/1000.0);
		
	}

}
