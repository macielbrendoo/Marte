package model;

import enums.DirectionEnum;

public class Position {
	private int x;
	private int y;
	private DirectionEnum dir;
	
	public Position(int x, int y, DirectionEnum dir){
		this.x = x;
		this.y = y;
		this.dir = dir;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public DirectionEnum getDir(){
		return dir;
	}

}
