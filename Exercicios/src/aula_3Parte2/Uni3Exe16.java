package aula_3Parte2;

import java.util.Scanner;

public class Uni3Exe16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe o valor:");
		int numero = s.nextInt();
				
		s.close();

		int nota100 = numero/100;
		int nota10 = numero%100/10;
		int nota1 = numero%10;
		System.out.println("Total de notas:"+(nota100+nota10+nota1)+"\nNota(s) de 100:"+nota100+
		"\nNota(s) de 10:"+nota10+"\nNota(s) de 1:"+nota1);
	}

}