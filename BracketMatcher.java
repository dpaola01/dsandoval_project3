class BracketMatcher{
	//fields go here

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
		for(int i =0; i<openingBracket.length; i++){
			if(openingBracket[i] == open){
				return true;
			}
		}
		for(int j = 0;j<closingBracket.length; j++){
			if(closingBracket[j]==close){
				return true;
			}
		}

		return false;
	}

	public boolean checkBrackets(String s){
		int stackSize = 50;
		Stack matchBrack = new Stack(stackSize);

		for(int i=0; i<s.length();i++){
			char c = s.charAt(i);
			if(isOpeningBracket(c)){
				matchBrack.push(c);
				continue;
			}
			
			char check;
			if(isClosingBracket(c)){
				check = matchBrack.pop();

				if(corresponds(c, check)){
					return false;
				}
				break;
			}

			else{
				return false;
			}
		}

		return (matchBrack.isEmpty());
	}
}