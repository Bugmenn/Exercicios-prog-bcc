package Unidade5;

import java.util.Scanner;

public class Uni5Exe01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		for (int i = 1; i<=20; i++) {
			System.out.print("Escreva o "+i+"° número:");
			int numero = s.nextInt();
			if (numero%2==0) {
				System.out.println("Par");
			} else {
				System.out.println("Ímpar");
			}
		}
		
		s.close();

	}
}
