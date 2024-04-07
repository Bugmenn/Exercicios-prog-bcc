package Unidade4;

import java.util.Scanner;

public class Uni4Exe24 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe o 1° número:");
		double numero1 = s.nextDouble();

		System.out.print("Informe o 2° número:");
		double numero2 = s.nextDouble();

		System.out.print("Informe o 3° número:");
		double numero3 = s.nextDouble();
		
		System.out.print("Informe a escolha:");
		int escolha = s.nextInt();

		s.close();
		
		switch (escolha) {
			case 1:
				if (numero1<numero2 && numero1<numero3) {
					if (numero2<numero3) {
						System.out.println(numero1+","+numero2+","+numero3);
					} else {
						System.out.println(numero1+","+numero3+","+numero2);
					}
				} else if (numero2<numero1 && numero2<numero3) {
					if (numero1<numero3) {
						System.out.println(numero2+","+numero1+","+numero3);
					} else {
						System.out.println(numero2+","+numero3+","+numero1);
					}
				} else {
					if (numero1<numero2) {
						System.out.println(numero3+","+numero1+","+numero2);
					} else {
						System.out.println(numero3+","+numero2+","+numero1);
					}
				}
				break;				
		
			case 2:
				if (numero1>numero2 && numero1>numero3) {
					if (numero2>numero3) {
						System.out.println(numero1+","+numero2+","+numero3);
					} else {
						System.out.println(numero1+","+numero3+","+numero2);
					}
				} else if (numero2>numero1 && numero2>numero3) {
					if (numero1>numero3) {
						System.out.println(numero2+","+numero1+","+numero3);
					} else {
						System.out.println(numero2+","+numero3+","+numero1);
					}
				} else {
					if (numero1>numero2) {
						System.out.println(numero3+","+numero1+","+numero2);
					} else {
						System.out.println(numero3+","+numero2+","+numero1);
					}
				}
				break;				
			
			case 3:
				if (numero1>numero2 && numero1>numero3) {
					System.out.println(numero2+","+numero1+","+numero3);
				} else if (numero2>numero1 && numero2>numero3) {
					System.out.println(numero1+","+numero2+","+numero3);
				} else {
					System.out.println(numero1+","+numero3+","+numero2);
				}
				break;				

			default:
				System.out.println("Valor invalido");
				break;
		}
	}

}
