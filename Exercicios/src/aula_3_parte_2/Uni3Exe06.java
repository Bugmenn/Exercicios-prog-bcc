package aula_3_parte_2;

import java.util.Scanner;

public class Uni3Exe06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe o peso:");
		float peso = s.nextFloat();
		
		s.close();
		
		System.out.println("O valor é de R$" + ((peso - 0.75) * 25));
	}

}