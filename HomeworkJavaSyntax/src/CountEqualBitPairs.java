import java.util.Scanner;
	

public class CountEqualBitPairs {	
		public static void main(String[] args) {
			try (Scanner input = new Scanner(System.in)) {
				int n = input.nextInt();
				
				int leadingZeroes = Integer.numberOfLeadingZeros(n);
				int indexLastBit = 31 - leadingZeroes;
				int countEqualBitPairs = 0;
				
				for (int i = 0; i < indexLastBit; i++) {
					int mask01 = 1 << i;
					int mask02 = 1 << (i + 1);
					
					Boolean cond01 = (n & mask01) == mask01; 
					Boolean cond02 = (n & mask02) == mask02; 

					Boolean cond03 = cond01 ^ cond02;
					if (!cond03) {
					countEqualBitPairs++;
					}
					}
					System.out.println(countEqualBitPairs);
					}
	}
		
}