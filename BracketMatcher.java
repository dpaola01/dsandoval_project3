class BracketMatcher{
	//fields go here

	public char[] openingBracket = {'(', '{', '[', '<'};
	public char[] closingBracket = {')', '}', ']', '>'};


	public boolean isOpeningBracket(char c){
		if(c == openingBracket[0] || c == openingBracket[1] || c == openingBracket[2] || c == openingBracket[3]){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean isClosingBracket(char c){
		if(c == closingBracket[0] || c == closingBracket[1] || c == openingBracket[2] || c == openingBracket[3]){
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

	}

	// public boolean checkBrackets(String s){

	// }

}