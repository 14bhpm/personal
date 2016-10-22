/* Beltan Michel - 14bhpm - 10169162
 * This program will run a game of Pig. For any information about the rules of the game, please see the greetingMessage method.
 * For more information: http://research.cs.queensu.ca/home/cisc124w/Fall2016/Assn1/Assignment1.html
 */

import java.util.Scanner;
import java.util.Random;

public class Assgn1_14bhpm{
	
	final static int SCORE_NEEDED = 100; 
	
	public static void main(String[] args){
		
		int playerScore[] = {0, 0}; 
		int computerScore[] = {0, 0};
		greetingMessage();
		int turnCounter = 0;
		 
		do{
			
			System.out.println("\nYour score: " + playerScore[0] + ", Computer's score: " + computerScore[0] + "\n\nAre you ready to start turn " + ++turnCounter + " ? (Simply press enter if you are)");
			inputChoice();
			playerScore = userTurn(playerScore); 
			
			if (playerScore[0] >= SCORE_NEEDED) 
				continue;
				
			computerScore = computerTurn(computerScore); 
				
		}while ((playerScore[0] < SCORE_NEEDED) && (computerScore[0] < SCORE_NEEDED)); 
		
		if (playerScore[0] > computerScore[0]){
			System.out.println("\n\nYou won ! Well played !");
			return;
		} // end of if(playerScore>computerScore)
		
		System.out.println("\n\nThe computer won ! You'll do better next time.");
		return;
		
	} // end of the main method
	
	//This method will play the user's turn.
	//It takes the userScore array defined in main as its parameter.
	public static int[] userTurn(int[] anArray){
		
		int firstDice; //This int will store the value of the first dice rolled
		int secondDice; //And this one the second
		boolean staysInLoop; //This boolean will be used to allow the user to play again
		
		do{
			System.out.println("You roll the dices!");
			firstDice = diceRolling();
			secondDice = diceRolling();
			System.out.println("You score a " + firstDice + " and a " + secondDice);
			
			if (firstDice == secondDice){
				
				if (firstDice == 1){
					System.out.println("\nYour turn is over and you lose all of your points ! Bad luck...\n");
					return doubleOnes(anArray);
				} // end of if(firstDice==1)
				
				anArray[1] += firstDice + secondDice;
				System.out.println("\nYour turn score is " + anArray[1] + "\nYou have to roll the dices again !");
				staysInLoop = true;
				continue;	
			} // end of if(firstDice==secondDice)
			
			if (firstDice == 1 || secondDice == 1){
				System.out.println("\nYour turn is over and you got zero points out of it.\n");
				anArray[1] = 0;
				return anArray;
			} //end of if(firstDice==1 || secondDice==1)
			
			anArray[1] += (firstDice + secondDice);
			System.out.println("\nYour turn score is " + anArray[1] + "\nDo you want to roll again? (y/n) ");
			staysInLoop = inputChoice();
			
		}while (staysInLoop);
		
		anArray = addTurntoTotal(anArray);
		System.out.println("You finish your turn. Your total score is now " + anArray[0]);
		return anArray;
	} // end of the userTurn method
	
	//This method will play the computer's turn
	// It takes the computerScore array defined in main as its parameter.
	public static int[] computerTurn(int[] anArray){
		
		boolean staysInLoop;
		int firstDice;
		int secondDice;
		
		do{
			System.out.println("Computer rolls the dices!");
			firstDice = diceRolling();
			secondDice = diceRolling();
			System.out.println("Computer scores a " + firstDice + " and a " + secondDice);
			
			if (firstDice == secondDice){
				
				if (firstDice == 1){
					System.out.println("\nComputer's turn is over and they lose all of their points !\nThis is your luck !");
					return doubleOnes(anArray);
				} // end of if(firstDice==1)
				
				anArray[1] += (firstDice + secondDice);
				System.out.println("\nComputer's turn score is " + anArray[1] + "\nComputer has to roll the dices again !");
				staysInLoop = true;
				continue;
			} // end of if(firstDice==secondDice)
			
			if (firstDice == 1 || secondDice == 1){
				System.out.println("\nComputer's turn is over and they got zero points out of it.");
				anArray[1] = 0;
				return anArray;
			} //end of if(firstDice==1 || secondDice==1)
			
			anArray[1] += (firstDice + secondDice);
			System.out.println("\nComputer's turn score is " + anArray[1]);
			
			//If the computer scored less than 40 this turn or if its total score is less than what is needed to win, it will roll the dices at least one more time.
			if ((anArray[1]<40) && (anArray[0] + anArray[1] < SCORE_NEEDED)) {
				staysInLoop = true;
				System.out.println("Computer wants to roll again!");
			} else { 
				staysInLoop = false;
			}
		} while (staysInLoop); // end of the while loop
		
		anArray = addTurntoTotal(anArray);
		System.out.println("Computer finishes its turn. Its total score is " + anArray[0]);
		return anArray;
		
	} // end of the computerTurn method
	
	//This method generates a random number between 1 and 6.
	public static int diceRolling(){
		
		Random random = new Random();
		int diceNumber = random.nextInt(6) + 1; //If I omitted the '+ 1', the possible outcomes would be 0, 1, 2, 3, 4, 5. With the +1 they become the correct output for a dice roll.
		return diceNumber;
		
	} // end of the diceRolling method
	
	//This method will display a greeting message and explain the rules if the user doesn't know them.
	public static void greetingMessage(){
		
		System.out.println("Hello and welcome! I hope you had a nice day so far, but if not, cheer up!\nFor we are gonna play the Game of Pig!\nDo you know how to play ? (y/n): ");
		boolean answer;
		answer = inputChoice(); 
		
		if (answer){ //If the player already knows the rules, the greetingMessage method ends. Otherwise it displays them.
			System.out.println("Okay, let's go straight to the game then!");
			return;
		} // end of if condition
		
		System.out.println("Alright, let's explain the rules. \nAfter each line, press enter to go to the next.");
		inputChoice();
		System.out.println("You are going to play against the computer.\nYou are both going to accumulate a score using two dices.");
		inputChoice();
		System.out.println("The sum of the two dices is going to determine what score you made.\nThe first to reach 100 points wins.");
		inputChoice();
		System.out.println("After you roll the dices, you can choose \nto add the turn score to your total one and finish it\nor to continue playing the turn.");
		inputChoice();
		System.out.println("A few rules apply however: \n\t-If you score two '1', you lose EVERYTHING!! (not the game though)\n\t-If you score doubles, you have to roll again.\n\t-If you score a '1' (not two), you lose your turn score and finish it.");
		inputChoice();
		System.out.println("The same rules apply to the computer of course.\nAlright, that's it for the rules, let's play now!");
		return;
		
	} // end of the greetingMessage method
	
	//Input Method that returns True if the input fulfills the given condition or False if it doesn't 
	//This method will recursively prompt the user for input if it does not understand what the user typed in.
	public static boolean inputChoice(){
		
		String userInput;
		Scanner screen = new Scanner(System.in);
		userInput = screen.nextLine();
		
		// If what the user entered is nothing (just pressed enter), 'y', 'Y' or 1, it returns true 
		if ((userInput.isEmpty()) || (userInput.toLowerCase().charAt(0) == 'y') || (userInput.charAt(0) == '1')) 
			return true;
			
		//Else if the user entered 'n', 'N' or 0, it returns false.	
		else if ((userInput.toLowerCase().charAt(0) == 'n') || (userInput.charAt(0) == '0'))
			return false;
			
		//And if it did not understand what the user entered, the method will call itself again and return that.	
		System.out.println("I did not understand what you said.\nPlease re-enter your choice ('y/n')");
		return inputChoice();
		
	} // end of the inputMethod
	
	//This method resets both the Turn score and Total score (when the player rolls two '1')
	// It takes either the computerInfo array or the userInfo array (both defined in main) as its parameter.
	public static int[] doubleOnes(int[] anArray){
		
		anArray[0]=0;
		anArray[1]=0;
		return anArray;
		
	} // end of the doubleOnes method
	
	// This method adds the Turn score to the Total score of the player when this one decides to finish their turn.
	// It takes either the computerInfo array or the userInfo array (both defined in main) as its parameter.
	public static int[] addTurntoTotal(int[] anArray){
		
		anArray[0] += anArray[1];
		anArray[1] = 0;
		return anArray;
		
	} // end of the addTurntoTotal method
	
} // end of the Assgn1_14bhpm class
