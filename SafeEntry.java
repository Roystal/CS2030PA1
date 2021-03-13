class SafeEntry implements WritableDevice{
private final int time;
private final int identifier;
private final DataStore db = new DataStore();

    SafeEntry(int identifier, int time) {
        this.identifier=identifier;
	this.time = time;
    }
    
    @Override
    public String toString() {
        return String.format("SafeEntry #%d@%d", identifier, time); 
    }

    @Override
    public void WriteDataAtTime(int time) {
	db.write(toTimeString(time));
}
    String toTimeString(int time) {
	return String.format("SafeEntry #%d%s", identifier, this.time == time ? String.format("@%d", time) : ": none");
}
}
