package Enum;

public enum DirectionEnum {
	N(0,1), W(-1,0), S(0,-1), E(1,0);
	
	private int x;
	private int y;
	
	DirectionEnum (int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getXDifference() {
		return this.x;
	}
	public int getYDifference(){
		return this.y;
	}
	
	public DirectionEnum getLeft(DirectionEnum dir) {
		switch(dir) {
			case N:
				return DirectionEnum.W;
			case W:
				return S;
			case S:
				return E;
			case E:
				return N;
		}
		return null;
	}
	
	public DirectionEnum getRight (DirectionEnum dir) {
	switch (dir) {
	case N:
		return E;
	case W:
		return N;
	case S:
		return W;
	case E:
		return S;
	}
		return null;	
	}

}
