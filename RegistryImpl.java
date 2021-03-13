class RegistryImpl extends Registry{
    private final WritableDevice[] tokens;

    RegistryImpl( String registry_Identifier, Token[] token) {
        super(registry_Identifier);
	this.tokens = new WritableDevice[token.length];

	for(int i =0; i<token.length; i++){
		tokens[i] = new RegisteredToken(token[i], this);
	}
    }

    RegistryImpl( String registry_Identifier ){
        this(registry_Identifier, new Token[]{});
    }
    
    RegistryImpl(Registry registry, WritableDevice[] tokens){
	super(registry);
	this.tokens = tokens;
}
    public void alert(int time) {
        for ( int i = 0; i< tokens.length ; i++){
            tokens[i].WriteDataAtTime(time); 
        }
    }

   @Override
   public String toString() {
       String calculate = "[" + super.input() + "]: " + tokens.length + " tokens registered";
	for ( int i = 0; i<tokens.length; i++){
	calculate+= "\n"+tokens[i].toString();
}
return calculate;
}

    @Override
    Registry add(Token token){ 
	WritableDevice writableDevice = new RegisteredToken(token, this);
	return add(writableDevice);
}

    @Override
    Registry add(WritableDevice wd) {
	WritableDevice[] updatedwd = new WritableDevice[tokens.length+1];
	for( int i=0; i<tokens.length; i++) {
		updatedwd[i] = tokens[i];}
	updatedwd[tokens.length] = wd;
	return new RegistryImpl(this, updatedwd);
}
}
