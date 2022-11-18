class BracketMatcher{
	//Instance fields
	//Hard coded closing and opening brackets for easier and later usage in BracketMatcher class

	public char[] openingBracket = {'(', '{', '[', '<'};
	public char[] closingBracket = {')', '}', ']', '>'};


	/* returns true if the character c is an opening bracket */
	public boolean isOpeningBracket(char c){
		if(c == openingBracket[0] || c == openingBracket[1] || c == openingBracket[2] || c == openingBracket[3]){
			return true;
		}
		else{
			return false;
		}
	}

	/* returns true if the character c is a closing bracket */
	public boolean isClosingBracket(char c){
		if(c == closingBracket[0] || c == closingBracket[1] || c == closingBracket[2] || c == closingBracket[3]){
			return true;
		}
		else{
			return false;
		}

	}

	/* returns true if the character open is a bracket
 	 * that corresponds to the closing bracket close
 	 */
	public boolean corresponds(char open, char close){

		int opeIndex = -1;
		int closeIndex = -1;

		for(int i=0; i<openingBracket.length; i++){
			if(openingBracket[i] == open){
				opeIndex = i;
			}
		}
		for(int j = 0;j<closingBracket.length; j++){
			if(closingBracket[j]==close){
				closeIndex = j;
			}
		}
		if(closeIndex == opeIndex && opeIndex != -1 && closeIndex != -1){
			return true;
		}
		else{
			return false;
		}
	}

	/*Checks if a string has matching brackets 
	 *returns false if string does not have matching brackets */
	public boolean checkBrackets(String s){
		int stackSize = 50;
		Stack matchBrack = new Stack(stackSize);
		for(int i=0; i<s.length();i++){
			char c = s.charAt(i);
			if(isOpeningBracket(c)){
				matchBrack.push(c);
			}
			else if(isClosingBracket(c)){
				char check = matchBrack.pop();
				if(!corresponds(check, c)){
					return false;
				}
			}
		}
		return (matchBrack.isEmpty());
	}
}