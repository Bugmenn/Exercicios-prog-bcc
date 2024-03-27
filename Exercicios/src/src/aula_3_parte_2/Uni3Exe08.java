package aula_3_parte_2;

import java.util.Scanner;

public class Uni3Exe08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe o valor em dólares:");
		float dolar = s.nextFloat();
		
		s.close();
		
		System.out.println("Valor em real:" + (dolar*5));
	}

}