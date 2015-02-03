import java.util.*;

public class Mathproc {
	
	Random Xval = new Random();
	Random Yval = new Random();
	Random Arithsymb = new Random();
	int Arith;
	int y;
	int x; 
	int Canswer;
	
	public void setX(){
		 x = Xval.nextInt(10) + 1;
	}
	
	public void setY() {
		y = Xval.nextInt(10) + 1;	
	}
	
	public void setArith() {
		Arith = Arithsymb.nextInt(4) + 1;
	}
	
	public void Mathrun() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		if(Arith == 1) {
			System.out.print(x + "+" + y);
			Canswer = (x + y);
			System.out.println("=?");
		}
		else if(Arith == 2) {
			System.out.print(x + "-" + y);
			Canswer = (x - y);
			System.out.println("=?");
		}
		else if(Arith == 3) {
			System.out.print(x + "/" + y);
			Canswer = (x / y);
			System.out.println("=?");
		}
		else {
			System.out.print(x + "*" + y);
			Canswer = (x * y);
			System.out.println("=?");
		}
		
		String Answer = sc.next();
		 try {
			 int i = Integer.parseInt(Answer.trim());
			 if (i == Canswer){
				 System.out.println("Correct!");
			 }
			 else {
				 System.out.println("incorrect!");
			 }
		 }
		 catch (NumberFormatException nfe) {
			 System.out.println("NumberFormatException: " + nfe.getMessage());
		 }
		 
	}

}
