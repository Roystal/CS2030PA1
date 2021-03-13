class Registry {
    private final String input;
    private final DataStore db = new DataStore();
  
    Registry( String input) {
        this.input = input;
    }

    Registry( Registry registry) {
	this(registry.input);
}    
    Registry () {
        this.input = "";
    }

    public void store(String message){
        this.db.write(message);
   }
   
   Registry add(Token token){
	return this;}

   Registry add(WritableDevice wd){
	return this;}

   @Override
   public String toString() {
       return "[" + this.input + "]";
   }
   
   public String input() {
	return input;
	}
   void alert(int time){};
}
