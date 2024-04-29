package aula_3Parte2;

import java.util.Scanner;

public class Uni3Exe07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de latas de 350ml:");
		int lata350 = s.nextInt();
		
		System.out.print("Informe a quantidade de garrafas de 600ml:");
		int garrafa600 = s.nextInt();
		
		System.out.print("Informe a quantidade de garrafas de 2 litros:");
		int garrafa2L = s.nextInt();
		
		s.close();
		
		System.out.println("O total de litros � de:" + (lata350*0.35 + garrafa600*0.6 + garrafa2L*2));
	}

}