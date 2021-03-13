class RegisteredToken extends Token implements WritableDevice {
    private final Registry registry;


    RegisteredToken( Token token, Registry registry ){
        super(token);
        this.registry = registry;
    }

    public void contact() {
        registry.store("Test contact");
    }

    public String toString() {
        return super.toString();
    }
@Override
    public void WriteDataAtTime(int time){
	registry.store(toTimeString(time));
}
}
