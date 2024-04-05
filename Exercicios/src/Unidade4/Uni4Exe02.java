package Unidade4;

import java.util.Scanner;

public class Uni4Exe02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe o número:");
		int numero = s.nextInt();

		s.close();
		
		if (numero%2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}

	}

}
