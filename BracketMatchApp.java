import java.io.*;
import java.util.Scanner;

class BracketMatchApp{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		BracketMatcher arr; //New bracketMatcher object
		arr = new BracketMatcher();

		/* Prints below are test code to see if boolean returns true or false
		 * when I input a close/open bracket. Same with both in one run */

		// System.out.println(arr.isOpeningBracket('['));
		// System.out.println(arr.isClosingBracket(']'));
		// System.out.println(arr.corresponds('[', '}'));

		//Acutal user input code to determine if it's a string with matching brackets :)
		System.out.println("Input a string: ");
		String string = s.nextLine();

		if(arr.checkBrackets(string)){
			System.out.println("matches");
		}

		else{
			System.out.println("no match");
		}

	}
}