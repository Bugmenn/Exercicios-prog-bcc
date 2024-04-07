package Unidade4;

import java.util.Scanner;

public class Uni4Exe26 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("'T': calcular a área de um triângulo de base b e altura h\n"+
		"'Q': calcular a área de um quadrado de lado l\n"+
		"'R': calcular a área de um retângulo de base b e altura h\n"+
		"'C': calcular a área de um círculo de raio r\nEscolha:");
		char escolha = s.nextLine().charAt(0);
		
		switch (escolha) {
			case 'T':
				System.out.print("Informe a base:");
				double base = s.nextDouble();

				System.out.print("Informe a altura:");
				double altura = s.nextDouble();
				
				System.out.println("Área:"+base*altura/2);
				break;
			
			case 'Q':
				System.out.print("Informe o lado:");
				double lado = s.nextDouble();

				System.out.println("Área:"+lado*lado);
				break;

			case 'R':
				System.out.print("Informe a base:");
				double base1 = s.nextDouble();

				System.out.print("Informe a altura:");
				double altura1 = s.nextDouble();

				System.out.println("Área:"+base1*altura1);
				break;
				
			case 'C':
				System.out.print("Informe o raio:");
				double raio = s.nextDouble();

				System.out.println("Área:"+3.14*(raio*raio));
				break;

			default:
				System.out.println("Valor invalido");
				break;
		}
		s.close();
	}

}
