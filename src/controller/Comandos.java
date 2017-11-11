package controller;

import model.Sonda;
import converter.Converter;

public class Comandos {
	public void runCommand(Converter c, Sonda sonda) {
		switch (c) {
		case MOVE:
			sonda.move();
		case LEFT:
			sonda.turnLeft();
		case RIGHT:
			sonda.turnRight();
		}
	}
}
