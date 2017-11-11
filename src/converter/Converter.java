package converter;

public enum Converter {
	MOVE('m','M'),
	LEFT('l','L'),
	RIGHT('r','R');
	
	private char lower;
	private char upper;
	
	Converter (char lower, char upper){
		this.lower = lower;
		this.upper = upper;
	}
	
	public char getLower() {
		return lower;
	}
	
	public char getUpper(){
		return upper;
	}
	
	public static Converter getCommand(char c) {
		for(Converter com : Converter.values()) {
			if(com.getLower() == c || com.getUpper() == c) {
				return com;
			}
		}
		return null;
	}
}
