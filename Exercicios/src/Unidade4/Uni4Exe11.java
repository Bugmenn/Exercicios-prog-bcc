package Unidade4;

import java.util.Scanner;

public class Uni4Exe11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe a idade de Marquinhos:");
		int idade_mar = s.nextInt();

		System.out.print("Informe a idade de Zezinho:");
		int idade_ze = s.nextInt();
		
		System.out.print("Informe a idade de Luluzinha:");
		int idade_lu = s.nextInt();

		s.close();
		
		if (idade_mar < idade_ze && idade_mar < idade_lu) {
			System.out.println("Marquinhos é o caçula");
		} else if (idade_ze < idade_mar && idade_ze < idade_lu) {
			System.out.println("Zezinho é o caçula");
		} else {
			System.out.println("Luluzinha é a caçula");
		}
	}

}
