package Unidade4;

import java.util.Scanner;

public class Uni4Exe09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe o 1° número:");
		int numero1 = s.nextInt();

		System.out.print("Informe o 2° número:");
		int numero2 = s.nextInt();
		
		s.close();
		
		if (numero1%numero2 == 0 || numero2%numero1 == 0) {
			System.out.println("São múltiplos");
		} else {
			System.out.println("NÃO são múltiplos");
		}
	}

}
