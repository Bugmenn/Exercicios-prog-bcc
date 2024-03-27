package aula_3;

import java.util.Scanner;

public class Execut2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Exe2 circulo = new Exe2();
		
		System.out.print("Escreva o raio:");
		circulo.raio = s.nextFloat();
		System.out.println("�rea:" + circulo.calcularArea());
		s.close();
	}

}