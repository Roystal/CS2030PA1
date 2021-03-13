class Token {
      private final int identifier;
      private final int[] tokens;
      
      Token ( int identifier) {
          this.identifier = identifier;
          tokens = new int[21];
      }

	protected Token(Token inputToken) {
	this.identifier = inputToken.identifier;
	tokens = new int[21];
	for( int i = 0; i<tokens.length; i++) {
		tokens[i]= inputToken.tokens[i];
	}
	}
      
      @Override
      public String toString() {
          if( tokens[0] == -1 ){
              return "Token #" + identifier + ":" + this.displayTokens(this.tokens, false, 0);
          } else {
          return "Token #" + identifier + ": none";
      }
      }

      public String displayIdentifer( int time_Value ){
          return "#" + this.identifier + "@" + time_Value;
      }

      public String toTimeString(int time) {
           if( tokens[0] == -1) {
		return "Token #" + identifier + ":" + this.displayTokens(this.tokens, true, time);
	} else {
		return "Token #" + identifier + ": none";
	}
	}
		

      public String displayTokens ( int[] tokens, boolean hasTimeConstraint, int time){
	String result = "";
	boolean hasPing = false;
          for ( int i = 1; i< tokens.length ; i++){
              if ( tokens[i] > 0 && (!hasTimeConstraint || (hasTimeConstraint && time == tokens[i])) ) {
		hasPing = true;
                  result+= " " + new Token(i).displayIdentifer(tokens[i]);
              } else if ( tokens[i] == 0 ) {
		continue;
          }
}
	if(hasPing == false) {
	result = " none";
}
	return result;
      }

    Token ping ( Token token, int time_Value ) {
	tokens[0] =-1;
	Token updatedToken = new Token(this);
	updatedToken.tokens[token.identifier] = time_Value;
         return updatedToken;
    }

    }
