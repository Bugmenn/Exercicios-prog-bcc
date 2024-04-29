package aula_3Parte2;

import java.util.Scanner;

public class Uni3Exe13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe a altura:");
		float altura = s.nextFloat();
		
		System.out.print("Informe o comprimento:");
		float comprimento = s.nextFloat();
		
		s.close();
		
		System.out.println("O gasto foi de R$"+((altura*comprimento) * 9 * 12.5f));
	}

}