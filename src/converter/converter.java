package converter;

public enum converter {
	MOVE('m','M'),
	LEFT('l','L'),
	RIGHT('r','R');
	
	private char lower;
	private char upper;
	
	converter (char lower, char upper){
		this.lower = lower;
		this.upper = upper;
	}
	
	public char getLower() {
		return lower;
	}
	
	public char getUpper(){
		return upper;
	}
	
	public converter getCommand(char c) {
		for(converter com : converter.values()) {
			if(com.getLower() == c || com.getUpper() == c) {
				return com;
			}
		}
		return null;
	}
}
