package aula_3_parte_2;

import java.util.Scanner;

public class Uni3Exe04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe a 1° nota:");
		float nota1 = s.nextFloat();
		
		System.out.print("Informe a 2° nota:");
		float nota2 = s.nextFloat();
		
		System.out.print("Informe a 3° nota:");
		float nota3 = s.nextFloat();
		
		s.close();
		
		System.out.println("A média ponderada é de:"+ (nota1*5 + nota2*3 + nota3*2)/10);
	}

}