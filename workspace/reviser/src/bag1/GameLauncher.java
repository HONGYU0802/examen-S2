package bag1;

class Player{
	int number=0;
	public void guess(){
		number=(int)(Math.random()*10);
		System.out.println("I'am gussing"+number);
	}
}


class Guessgame{
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame(){
		p1=new Player();
		p2=new Player();
		p3=new Player();
		
		int guess1=0;
		int guess2=0;
		int guess3=0;
		
		boolean p1right=false;
		boolean p2right=false;
		boolean p3right=false;
		
		int targetNumber=(int)(Math.random()*10);
		System.out.println("I'am thinking of a number between 0 and 9...");
		
		while(true){
			System.out.println("NUmber to guess is"+targetNumber);
			
			p1.guess();
			p2.guess();
			p3.guess();
			
			guess1=p1.number;
			guess2=p2.number;
			guess3=p3.number;
			
			if(guess1==targetNumber){
				p1right=true;
			}
			if(guess2==targetNumber){
				p2right=true;
			}
			if(guess3==targetNumber){
				p3right=true;
			}
			
			if(p1right || p2right || p3right){
				System.out.println("we have a winner");
				System.out.println("player1 got it right?"+p1right);
				System.out.println("player2 got it right?"+p2right);
				System.out.println("player3 got it right?"+p3right);
				
				break;
			}
			else{
				System.out.println("players will have to try again");
			}
			
		}
	}
}
public class GameLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guessgame guessgame=new Guessgame();
		guessgame.startGame();
	}

}
