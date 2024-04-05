package Unidade4;

import java.util.Scanner;

public class Uni4Exe06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("M ou F ou I:");
		char resposta = s.next().charAt(0);

		s.close();

		resposta = Character.toUpperCase(resposta);
		
		if (resposta == 'M') {
			System.out.println("Masculino");
		} else if (resposta == 'F') {
			System.out.println("Feminino");
		} else if (resposta == 'I') {
			System.out.println("Não informado");
		} else {
			System.out.println("Entrada incorreta");
		}

	}

}
