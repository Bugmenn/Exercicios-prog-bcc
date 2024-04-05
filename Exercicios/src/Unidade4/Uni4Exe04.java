package Unidade4;

import java.util.Scanner;

public class Uni4Exe04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe o número:");
		double numero = s.nextDouble();

		s.close();
		
		if (numero%1 > 0) {
			System.out.println("Tem casas decimais");
		} else {
			System.out.println("Não tem casas decimais");
		}

	}

}
