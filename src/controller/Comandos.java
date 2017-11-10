package controller;

import model.Position;
import model.Sonda;

public class Comandos {
	public static Sonda move(Sonda sonda) {
		sonda.setPos(new Position(sonda.getPos().getX() + sonda.getPos().getDir().getXDifference(),
				sonda.getPos().getY() + sonda.getPos().getDir().getYDifference(), sonda.getPos().getDir()));
		return sonda;
	}

	public static Sonda turnLeft(Sonda sonda) {
		sonda.setPos(new Position(sonda.getPos().getX(), sonda.getPos().getY(),
				sonda.getPos().getDir().getLeft(sonda.getPos().getDir())));
		return sonda;
	}

	public static Sonda turnRight(Sonda sonda) {
		sonda.setPos(new Position(sonda.getPos().getX(), sonda.getPos().getY(),
				sonda.getPos().getDir().getRight(sonda.getPos().getDir())));
		return sonda;
	}
}
