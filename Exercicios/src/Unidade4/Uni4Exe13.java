package Unidade4;

import java.util.Scanner;

public class Uni4Exe13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe a 1° carta:");
		int carta1 = s.nextInt();

		System.out.print("Informe a 2° carta:");
		int carta2 = s.nextInt();

		System.out.print("Informe a 3° carta:");
		int carta3 = s.nextInt();	
	
		s.close();
		
		int qtBoa = 0;

		if (carta1 <= 3) {
			qtBoa++;
		}
		if (carta2 <= 3) {
			qtBoa++;
		} 
		if (carta3 <= 3) {
			qtBoa++;
		}
		if (qtBoa == 1) {
			System.out.println("TRUCO");
		} else if (qtBoa == 2) {
			System.out.println("SEIS");
		} else if (qtBoa == 3) {
			System.out.println("NOVE");
		}
	}

}
