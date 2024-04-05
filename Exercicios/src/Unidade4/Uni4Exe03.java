package Unidade4;

import java.util.Scanner;

public class Uni4Exe03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe o 1° número:");
		int numero1 = s.nextInt();

		System.out.print("Informe o 2° número:");
		int numero2 = s.nextInt();

		s.close();
		
		if (numero1 > numero2) {
			System.out.println(numero1+" é maior que "+numero2);
		} else {
			System.out.println(numero2+" é maior que "+numero1);
		}

	}

}
