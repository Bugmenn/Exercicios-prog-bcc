package aula_3Parte2;

import java.util.Scanner;

public class Uni3Exe05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de frangos:");
		int quantidade = s.nextInt();
		
		s.close();
		
		System.out.println("O gasto total � de R$" + (quantidade*4 + quantidade*(3.5*2)));
	}

}