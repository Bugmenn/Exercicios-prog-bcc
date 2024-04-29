package aula_3Parte2;

import java.util.Scanner;

public class Uni3Exe15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe o número:");
		int numero = s.nextInt();
				
		s.close();
		
		System.out.println(numero/100+" centena(s) "+numero%100/10+" dezena(s) "+numero%10+" unidade(s)");
	}

}