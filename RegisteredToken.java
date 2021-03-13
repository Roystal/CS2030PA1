class RegisteredToken {
    private final Token token;
    private final Registry registry;


    RegisteredToken( Token token, Registry registry ){
        this.token = token;
        this.registry = registry;
    }

    public String contact() {
        return "Test contact";
    }

    public String toString() {
        return token.toString();
    }


}
