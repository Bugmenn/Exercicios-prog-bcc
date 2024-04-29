package aula_3Parte2;

import java.util.Scanner;

public class Uni3Exe01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Escreva a altura:");
		float altura = s.nextFloat();
		
		System.out.print("Escreva a largura:");
		float largura = s.nextFloat();
		
		s.close();
		
		System.out.println("�rea do terreno:"+largura*altura);
	}

}