import java.io.*;
import java.util.Scanner;

class BracketMatchApp{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		BracketMatcher arr;                // declare a variable of type HighArray
		arr = new BracketMatcher();

		System.out.println(arr.isOpeningBracket('['));
		System.out.println(arr.isClosingBracket(']'));
		System.out.println(arr.corresponds('[', '}'));


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