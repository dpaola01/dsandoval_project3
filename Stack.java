public class Stack {
	/* Fields*/
		private char[] numStack;
		private int top;

	/*constructor and other stack methods go here*/

	public Stack(int max){
		//head = null;
		numStack = new char[max];
		top = 0;
	}

	public void push(char val){
		numStack[top] = val;
		top ++;
	}

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