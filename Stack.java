public class Stack {
	/* Fields*/
		private long[] numStack;
		private int top;

	/*constructor and other stack methods go here*/

	public Stack(int max){
		//head = null;
		numStack = new long[max];
		top = 0;
	}

	public void push(long val){
		numStack[top] = val;
		top ++;
	}

	public long pop(){
	 	long temp = numStack[top-1];
	 	top--;
	 	return temp;
	}

	public long peek(){
		return numStack[top-1];
	}

	public boolean isEmpty(){
		return (top==0);
	}

	public int size(){
		return top;
	}

}