public class Stack {
	/* Fields*/
		private char[] numStack;
		private int top;

	//Creating an empty stack with max amount of values.
	//Constructor- 
	public Stack(int max){
		numStack = new char[max];
		top = 0; //Top or size of stack
	}

	public void push(char val){
		numStack[top] = val;
		top ++;
	}

	//Made these into char objects since we'll be working with brackets
	public char pop(){
	 	char temp = numStack[top-1];
	 	top--;
	 	return temp;
	}

	public char peek(){
		return numStack[top-1];
	}

	public boolean isEmpty(){
		return (top==0);
	}

	public int size(){
		return top;
	}

	public void display() {
		for(int j=0; j<top; j++){      // for each element,
			System.out.print(numStack[j] + " ");  // display it
		}
		System.out.println("");
	}

}