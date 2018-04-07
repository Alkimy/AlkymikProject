import java.util.Scanner;

import Program.*;

public class Main {


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Program p = new ProgramClass();
		Commands c = getCommand(in);
		executeCommands(c, in);
		System.out.println("Ate a proxima.");
		in.close();
	}

	private static void executeCommands(Commands c, Scanner in) {
		while(!c.equals(Commands.SAI)) {
			switch(c) {
			case REGISTA:
				break;
			case STAFF:
				break;
			case CENARIO:
				break;
			case CENARIOS:
				break;
			case MARCA:
				break;
			case AMUA:
				break;
			case RECONCILIA:
				break;
			case PREVISTAS:
				break;
			case REALIZADOS:
				break;
			case LOCAL:
				break;
			case COLABORADOR:
				break;
			case GRAVA:
				break;
			case AMUANCOS:
				break;
			case AJUDA:
				help();
				break;
			default:
				System.out.println();
				break;
			}
			c = getCommand(in);
		}

	}

	private static void help() {
		for(Commands c: Commands.values())
			System.out.printf(c + c.getString());
		
	}

	private static Commands getCommand(Scanner in) {
		try {
			return  Commands.valueOf(in.next().toUpperCase());
		}catch (IllegalArgumentException e) {
			return null;}
	}



}
