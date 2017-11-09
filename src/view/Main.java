package view;

import java.util.Scanner;

import controller.Comandos;
import enums.DirectionEnum;
import model.Position;
import model.Sonda;
import model.Field;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Field planalto = new Field(new Position(scan.nextInt(),scan.nextInt(),null));
		Sonda sonda = new Sonda(new Position(0,0,DirectionEnum.N));
	}

}
