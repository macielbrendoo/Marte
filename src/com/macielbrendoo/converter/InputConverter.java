package com.macielbrendoo.converter;

import java.util.ArrayList;

import com.macielbrendoo.enums.Commands;

public class InputConverter {

	public static ArrayList<Commands> stringToEnumArray(String entrada) {
		ArrayList<Commands> comm = new ArrayList<Commands>();
		for (char c : entrada.toCharArray()) {
			comm.add(Commands.getCommand(c));
		}
		return comm;
	}
}
