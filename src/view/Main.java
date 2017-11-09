package view;

import java.util.Scanner;

import controller.Comandos;
import enums.DirectionEnum;
import model.Position;
import model.Sonda;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Sonda sonda = new Sonda(new Position(0,0,DirectionEnum.N));
	}

}
