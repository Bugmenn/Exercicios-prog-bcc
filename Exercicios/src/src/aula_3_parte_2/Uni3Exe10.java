package aula_3_parte_2;

import java.util.Scanner;

public class Uni3Exe10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe o 1° cateto:");
		float cateto1 = s.nextFloat();
		
		System.out.print("Informe o 2° cateto:");
		float cateto2 = s.nextFloat();
		
		s.close();
		
		System.out.println("Hipotenusa:"+((cateto1*cateto1) + (cateto2*cateto2)));
	}

}