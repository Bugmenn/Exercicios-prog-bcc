package aula_3Parte2;

import java.util.Scanner;

public class Uni3Exe14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe a dist�ncia percorrida:");
		float distancia = s.nextFloat();
		
		System.out.print("Informe o tempo gasto:");
		float tempo = s.nextFloat();
		
		s.close();
		
		System.out.println("Velocidade m�dia:"+distancia/tempo+"\n"
				+ "Combustivel gasto:"+distancia/12);
	}

}