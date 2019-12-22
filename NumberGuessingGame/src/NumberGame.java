import java.util.Scanner;
import java.util.Random;
public class NumberGame {
	
	public static void main(String[] args)
	{
		
		
		Scanner userInput = new Scanner(System.in);
		int mode = 0;
		while(true){
			System.out.println("1. Easy");
			System.out.println("2. Normal");
			System.out.println("3. Hard");
			System.out.print("Enter a mode:");
			do
			{
				mode = userInput.nextInt();
			}while(mode < 1 || mode > 3);
			
			int numberOfGuesses = 0;
			int maxNumber = 0;  
			
			switch(mode) {
			case 1:
				numberOfGuesses = 20;
				maxNumber = 20;
				System.out.println("Guess a number between 1 and 20");
				break;
			case 2:
				numberOfGuesses = 10;
				maxNumber = 100;
				System.out.println("Guess a number between 1 and 100");
				break;
			case 3:
				numberOfGuesses = 5;
				maxNumber = 1000;
				System.out.println("Guess a number between 1 and 1000");
				break;
				
				
				
			}
			
			Random rand = new Random();
			int numberToGuess = rand.nextInt(maxNumber) +1;
			int guess = 0;
			
			for(int i = 0; i < numberOfGuesses;i++) {
				guess = userInput.nextInt();
				if(guess > numberToGuess)
					System.out.println("Too High");
				else if(guess < numberToGuess)
					System.out.println("Too Low");
				else {
					System.out.println("Congratulations, you won!");
					break;
				}
					
				}
			if(guess!=numberToGuess)
				System.out.println("Try Again");
			System.out.println("Would you like to run again? [positive for yes, negative for no]: ");
			int answer = userInput.nextInt();
			
			if(answer < 0)
				break;
				
			}
		}
	}
