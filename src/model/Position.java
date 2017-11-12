package model;

import enums.Direction;

public class Position {
	private int x;
	private int y;
	private Direction dir;

	public Position(int x, int y, Direction dir) {
		this.x = x;
		this.y = y;
		this.dir = dir;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Direction getDir() {
		return dir;
	}

}
