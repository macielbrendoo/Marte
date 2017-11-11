package model;

public class Sonda {
	private Position pos;

	public Sonda(Position pos){
		this.pos = pos;
	}
	
	public Position getPos() {
		return pos;
	}
	public void move() {
		pos = new Position (pos.getX()+pos.getDir().getXDifference() , pos.getY()+pos.getDir().getYDifference(), pos.getDir());
	}
	public void turnLeft() {
		pos = new Position (pos.getX(), pos.getY(), pos.getDir().getLeft(pos.getDir()));
	}
	public void turnRight() {
		pos = new Position (pos.getX(), pos.getY(), pos.getDir().getRight(pos.getDir()));
	}

}
