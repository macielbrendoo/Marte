package controller;

import java.util.ArrayList;
import converter.Converter;

public class Input {

	public void StringToEnumArray(String entrada) {
		ArrayList<Converter> comm = new ArrayList<Converter>();
		for (char c : entrada.toCharArray()) {
			comm.add(Converter.getCommand(c));
		}
	}
}
 