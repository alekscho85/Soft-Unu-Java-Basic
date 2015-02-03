public class Mathtimed {
	
	public static void main(String[] args) {
		
		int x;
		x = 0;
		@SuppressWarnings("unused")
		boolean play;
		play = true;
		Mathproc game = new Mathproc();
		while(play = true){
			if(x == 10)
				play = false;
			game.setX();
			game.setY();
			game.setArith();
			game.Mathrun();
			x++;
			
		}
		
	}
}