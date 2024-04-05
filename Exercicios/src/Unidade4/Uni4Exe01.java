package Unidade4;

import java.util.Scanner;

public class Uni4Exe01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe as horas:");
		int horas = s.nextInt();

		System.out.print("Informe o valor:");
		double valor_hora = s.nextDouble();
		
		s.close();
		
		double total = valor_hora * horas;
		
		if (horas > 160) {
			double extra = (valor_hora/2) * (horas-160);
			total += extra;
		}

		System.out.println("Salario total:"+total);
	}

}
