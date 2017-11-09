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
	
	public void runArray (ArrayList<Converter> comm) {
		for (int i = 0; i <= comm.size(); i++) {
			switch(comm.get(i)) {
			case MOVE:
				
			case RIGHT:
			case LEFT:
			}
		}
	}

}
