package aula_3_parte_2;

import java.util.Scanner;

public class Uni3Exe02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe o preço:");
		float preco = s.nextFloat();
		
		s.close();
		
		System.out.println("O valor do desconto é de R$"+(preco*0.12));
		System.out.println("O preço do par de sapatos com desconto é R$"+(preco-(preco*0.12)));
	}

}