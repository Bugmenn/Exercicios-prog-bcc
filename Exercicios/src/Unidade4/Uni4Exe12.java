package Unidade4;

import java.util.Scanner;

public class Uni4Exe12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe o 1° lado:");
		double lado1 = s.nextDouble();

		System.out.print("Informe o 2° lado:");
		double lado2 = s.nextDouble();

		System.out.print("Informe o 3° lado:");
		double lado3 = s.nextDouble();	
	
		s.close();
		
        if (lado1>(lado2+lado3) || lado2>(lado1+lado3) || lado3>(lado1+lado2)) {
            System.out.println("Não é um triângulo");
        } else if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("Equilátero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Isósceles");
        } else {
            System.out.println("Escaleno");
        }
	}

}
