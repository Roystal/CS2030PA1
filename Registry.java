class Registry {
    private final String input;
    private final DataStore db;
  
    Registry( String input) {
        this.input = input;
        this.db = new DataStore();
    }

    public void store(String message){
        this.db.write(message);
   }

   public void add( Token token ){
    }

   @Override
   public String toString() {
       return this.input;
   }
}
