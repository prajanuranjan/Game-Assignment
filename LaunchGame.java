package Game;

import java.util.*;

class Guesser{
	int guessNumber;
	public int guessNumber()
	{
		System.out.println("Guesser kindly guess the number");
		Scanner sc = new Scanner(System.in);
		int guessNumber=sc.nextInt();
		return guessNumber;
	}
}
class Player{
	int pguessNumber;
	public int pguessNumber()
	{
//		System.out.println("Player kindly guess the number");
		Scanner sc = new Scanner(System.in);
		int pguessNumber=sc.nextInt();
		return pguessNumber;
	}
}
class Umpire{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	public void collectNumFromGuesser(){
		Guesser g=new Guesser();
		numFromGuesser = g.guessNumber();
	}
	
	public void collectNumFromPlayer(){
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		System.out.println("Player1 kindly guess the number");
		numFromPlayer1 = p1.pguessNumber();
		System.out.println("Player2 kindly guess the number");
		numFromPlayer2 = p2.pguessNumber();
		System.out.println("Player3 kindly guess the number");
		numFromPlayer3 = p3.pguessNumber();
	}
	
	public void compare()
	{
		if(numFromGuesser == numFromPlayer1)
		{
			if(numFromGuesser == numFromPlayer2  && numFromGuesser == numFromPlayer3)
			{
				System.out.println("Game tied all three players guessed correctly");
			}
			else if(numFromGuesser == numFromPlayer2)
			{
				System.out.println("Player1 and Player2 have won");
			}
			else if(numFromGuesser == numFromPlayer3)
			{
				System.out.println("Player1 and Player3 have won");
			}
		
			else
				System.out.println("Player1 won the game");
		}
		else if(numFromGuesser == numFromPlayer2)
		{
			if(numFromGuesser == numFromPlayer3)
			{
				System.out.println("Player2 and Player3 have won");
			}
			else
			{
			System.out.println("Player2 have won");
			}
		}
		else if(numFromGuesser == numFromPlayer3)
		{
			System.out.println("Player3 have won");
		}
		else
		{
		System.out.println("Guess didn't match! Try again");
		}
	}
	
}

public class LaunchGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();
	}

}
