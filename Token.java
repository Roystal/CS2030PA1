class Token {
      private final int identifier;
      private final Token[] tokens;
      
      Token ( int identifier) {
          this.identifier = identifier;
          tokens = new Token[21];
      }
      
      @Override
      public String toString() {
          if( Token[0] != null ){
              return "Token #" + identifier + this.displayTokens(this.tokens);
          } else {
          return "Token #" + identifier + this.to;
      }
      }

      public String displayIdentifer( int time_Value ){
          return "#" + this.identifier + "@" + time_Value;
      }

      public String displayTokens ( Token[] tokens ){
          for ( int i = 0; i< tokens.length ; i++){
              if ( tokens[i] != null ) {
                  return " " + tokens[i].displayIdentifier;
              }
          }
      }

    void ping ( Token token, int time_Value ) {
         return this.toString + token.displayIdentifer(time_Value);
    }

    }
