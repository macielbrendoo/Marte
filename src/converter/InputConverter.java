package converter;

import java.util.ArrayList;

import enums.Commands;

public class InputConverter {

	public ArrayList<Commands> stringToEnumArray(String entrada) {
		ArrayList<Commands> comm = new ArrayList<Commands>();
		for (char c : entrada.toCharArray()) {
			comm.add(Commands.getCommand(c));
		}
		return comm;
	}
}
