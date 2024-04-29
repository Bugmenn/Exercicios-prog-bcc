package aula_3Parte2;

import java.util.Scanner;

public class Uni3Exe02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe o pre�o:");
		float preco = s.nextFloat();
		
		s.close();
		
		System.out.println("O valor do desconto � de R$"+(preco*0.12));
		System.out.println("O pre�o do par de sapatos com desconto � R$"+(preco-(preco*0.12)));
	}

}