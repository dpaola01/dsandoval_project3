import java.io.*;
import java.util.Scanner;

class BracketMatchApp{
	public static void main(String[] args){
	// Scanner s = new Scanner(System.in);

	// System.out.println("Input a string: ");
	// String string = s.nextLine();

		Stack newStack = new Stack(50);
		newStack.push(200);
		newStack.push(230);
		newStack.push(240);
		//newStack.pop();
		newStack.display();

		System.out.println(newStack.size());

	}
}