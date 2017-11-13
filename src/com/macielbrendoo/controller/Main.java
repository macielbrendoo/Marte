package com.macielbrendoo.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.macielbrendoo.enums.Commands;
import com.macielbrendoo.enums.Direction;
import com.macielbrendoo.model.Field;
import com.macielbrendoo.model.Position;
import com.macielbrendoo.model.Probe;
import com.macielbrendoo.converter.InputConverter;

public class Main {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		Probe probe = new Probe(new Position(0, 0, Direction.N));
		String entrada;
		System.out.println("Digite o tamanho do planalto:");
		entrada = scan.nextLine();
		Field field = new Field(new Position(Character.getNumericValue(entrada.charAt(0)),
				Character.getNumericValue(entrada.charAt(2)), null));
		do {
			System.out.println("Digite os comandos para sonda executar1:");
			entrada = scan.nextLine();
			if (entrada != "") {
				try {
					Commands.runCommandsArray(InputConverter.stringToEnumArray(entrada), probe);
				} catch (IllegalArgumentException e) {
					System.out.println("Comandos inválidos");
				}
			}
		} while (entrada == "");
		System.out.println("Encerrado");
	}
}
