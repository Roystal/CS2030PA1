class RegistryImpl extends Registry{
    private final Token[] tokens;

    RegistryImpl( String registry_Identifier, Token[] tokens) {
        super(registry_Identifier);
        this.tokens = tokens;
    }

    RegistryImpl( int registry_Identifier ){
        super(registry_Identifier);
    }

    public void alert(int time) {
        for ( int i = 0; i< tokens.length ; i++){
            if ( ==
        }
    }

   @Override
   public String toString() {
       return "[" + super.input + "]: " + tokens.length + " tokens registered";
   }
}
