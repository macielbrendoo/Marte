package com.macielbrendoo.enums;

import java.util.ArrayList;

import com.macielbrendoo.model.Probe;

public enum Commands {
	MOVE('m', 'M') {
		@Override
		public void runCommand(Probe sonda) {
			sonda.move();
		}
	},
	LEFT('l', 'L') {
		@Override
		public void runCommand(Probe sonda) {
			sonda.turnLeft();
		}
	},
	RIGHT('r', 'R') {
		@Override
		public void runCommand(Probe sonda) {
			sonda.turnRight();
		}
	};

	private char lower;
	private char upper;

	public abstract void runCommand(Probe sonda);

	Commands(char lower, char upper) {
		this.lower = lower;
		this.upper = upper;
	}

	public char getLower() {
		return lower;
	}

	public char getUpper() {
		return upper;
	}

	public static Commands getCommand(char c) {
		for (Commands com : Commands.values()) {
			if (com.getLower() == c || com.getUpper() == c) {
				return com;
			}
		}
		throw new IllegalArgumentException();
	}

	public static void runCommandsArray(ArrayList<Commands> c, Probe probe) {
		for (int i =0; i< c.size(); i++) {
			c.get(i).runCommand(probe);
		}
	}
}
