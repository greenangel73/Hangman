import java.util.Scanner;

public class Hangman {
	public static String word = "RHINOCEROS";
	public static Scanner input = new Scanner(System.in);
	public static String letters = " _ _ _ _ _ _ _ _ _ _ ";
	public static int chance = 10;
	public static String answer;
	
	
	public static void main(String args[]) {
			
		System.out.println(" Welcome to the Hangman game!\n Guess the word I am thinking of: "
				+ "You have 10 tries by typing a letter or the whole word.\n The word I´m thinking of: One of the big fives.\n To start the game.\n\n Please press enter!");

		input.nextLine();
        userEnter();
	}

	public static void userEnter() {
		System.out.println(letters);
		System.out.println("\n You have " + chance + " of 10 chanse to guess!");
		System.out.println("\n Press that letter or word you wanna try!\n");
		answer = input.nextLine().toUpperCase();
		lookUp();	
	}
	
	public static void lookUp() {
		switch (answer) {
		case "R": {
			String letters1 = letters.substring(0, 1)+'R'+letters.substring(2, 15)+'R'+letters.substring(16);
			letters=letters1;
		break;
		}
		case "H": {
			String letters2 = letters.substring(0, 3)+ 'H'+letters.substring(4);
			letters=letters2;
		break;
		}
		case "I": {
			String letters3 = letters.substring(0, 5)+ 'I'+letters.substring(6);
			letters=letters3;
		break;
		}
		case "N": {
			String letters4 = letters.substring(0, 7)+ 'N'+letters.substring(8);
			letters=letters4;
		break;
		}
		case "O": {
			String letters5 = letters.substring(0, 9)+'O'+letters.substring(10, 17)+'O'+letters.substring(18);
			letters=letters5;			
		break;
		}
		case "C": {
			String letters6 = letters.substring(0, 11)+ 'C'+letters.substring(12);
			letters=letters6;
		break;
		}
		case "E": {
			String letters7 = letters.substring(0, 13)+ 'E'+letters.substring(14);
			letters=letters7;
		break;
		}
		case "S": {
			String letters8 = letters.substring(0, 19)+ 'S'+letters.substring(20);
			letters=letters8;
		break;
		}
		case "RHINOCEROS": {
			letters = " R H I N O C E R O S ";
		break;
		}
		default: { 
		chance--;
		}
		}
		hangMan();
		
		if (chance >0) {
			if (letters.equals(" R H I N O C E R O S ")) {
				System.out.println(letters);
				
				System.out.println(" You are a winner!");
			}
			else {
				userEnter();
			}
		}
		else {
			System.out.println(" You lose!");
		}
	}
	
	public static void hangMan(){
		switch (chance){
		case 10: {	
			System.out.println("     \n" + 
				    "     \n" + 
		          	"     \n" + 
					"       \n" + 
					"       \n" + 
					"  \n" + 
					"  ");
		break;
		}
		case 9: {	
			System.out.println("     \n" + 
				    "     \n" + 
		          	"     \n" + 
					"       \n" + 
					"       \n" + 
					"  \n" + 
					"/|\\");
		break;
		}
		
		case 8: {	
			System.out.println("     \n" + 
				    "     \n" + 
		          	"     \n" + 
					"       \n" + 
					"       \n" + 
					" |\n" + 
					"/|\\");
		break;
		}
		case 7: {	
			System.out.println("     \n" + 
				    "     \n" + 
		          	"     \n" + 
					"       \n" + 
					" |     \n" + 
					" |\n" + 
					"/|\\");
		break;
		}
		case 6: {	
			System.out.println("     \n" + 
				    "     \n" + 
		          	"     \n" + 
					" |     \n" + 
					" |     \n" + 
					" |\n" + 
					"/|\\");
		break;
		}
		case 5: {	
			System.out.println("     \n" + 
				    "     \n" + 
		          	" |   \n" + 
					" |     \n" + 
					" |     \n" + 
					" |\n" + 
					"/|\\");
		break;
		}
		case 4: {	
			System.out.println("     \n" + 
				    " |   \n" + 
		          	" |   \n" + 
					" |     \n" + 
					" |     \n" + 
					" |\n" + 
					"/|\\");
		break;
		}
		case 3: {	
			System.out.println(" ____\n" + 
				    " |   \n" + 
		          	" |   \n" + 
					" |     \n" + 
					" |     \n" + 
					" |\n" + 
					"/|\\");
			
		break;
		}
		case 2: {	
			System.out.println(" ____\n" + 
				    " |  |\n" + 
		          	" |   \n" + 
					" |     \n" + 
					" |     \n" + 
					" |\n" + 
					"/|\\");
			
		break;
		}
		case 1: {	
			System.out.println(" ____\n" + 
				    " |  |\n" + 
		          	" |  o\n" + 
					" |     \n" + 
					" |     \n" + 
					" |\n" + 
					"/|\\");
		break;
		}
		case 0: {	
			System.out.println(" ____\n" + 
				    " |  |\n" + 
		          	" |  o\n" + 
					" | /|\\\n" + 
					" | / \\\n" + 
					" |\n" + 
					"/|\\");
		}
		}	
	}	
}