package aula_3Parte2;

import java.util.Scanner;

public class Uni3Exe11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe a temperatura em celsius:");
		float temperatura = s.nextFloat();
		
		s.close();
		
		System.out.println("Fahrenheit:"+ (1.8 * temperatura + 32));
	}

}