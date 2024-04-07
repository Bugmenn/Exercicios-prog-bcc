package Unidade4;

import java.util.Scanner;

public class Uni4Exe25 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Informe o 1° número");
		double numero1 = s.nextInt();
		
		System.out.print("Informe o 2° número");
		double numero2 = s.nextInt();

		System.out.print("1 - Soma de dois números.\n2 - Diferença entre dois números."+
		"3 - Produto entre dois números.\n4 - Divisão entre dois números (o denominador não pode ser zero).");
		int escolha = s.nextInt();
		
		s.close();
		
		switch (escolha) {
			case 1:
				System.out.println(numero1+numero2);
				break;
			
			case 2:
				System.out.println(numero1-numero2);
				break;
			
			case 3:
				System.out.println(numero1*numero2);
				break;

			case 4:
				if (numero2==0) {
					System.out.println("O denominador não pode ser zero");
				} else {
					System.out.println(numero1/numero2);
				}

			default:
				System.out.println("Valor invalido");
				break;
		}
	}

}
