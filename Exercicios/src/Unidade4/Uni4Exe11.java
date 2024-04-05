package Unidade4;

import java.util.Scanner;

public class Uni4Exe11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe o 1° ano:");
		int ano1 = s.nextInt();

		System.out.print("Informe o 2° ano:");
		int ano2 = s.nextInt();

		System.out.print("Informe o 3° ano:");
		int ano3 = s.nextInt();	
	
		s.close();
		
		if (ano1 == ano2 && ano1 == ano3) {
			System.out.println("Trigêmeos");
		} else if (ano1 == ano2 || ano1 == ano3) {
			System.out.println("Gêmeos");
		} else {
			System.out.println("Irmãos");
		}

	}

}
