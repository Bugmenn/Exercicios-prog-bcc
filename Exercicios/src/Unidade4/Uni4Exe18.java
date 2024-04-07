package Unidade4;

import java.util.Scanner;

public class Uni4Exe18 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe o dia do vencimento:");
		int dia_vencimento = s.nextInt();
		
		System.out.print("Informe o dia do pagamento:");
		int dia_pagamento = s.nextInt();

		System.out.print("Informe o valor da prestação:");
		double valor = s.nextDouble();

		s.close();
		
		if (dia_pagamento<=dia_vencimento) {
			System.out.println("O pagamento está em dia e recebe 10% de desconto.\nValor:"+(valor-(valor*0.10)));
		} else if (dia_pagamento<=(dia_vencimento+5)) {
			System.out.println("O pagamento está atrasado em até 5 dias, sem desconto.\nValor:"+valor);
		} else {
			System.out.println("O pagamento está atrasado a mais de 5 dias, "+
			"recebera uma multa a de 2% por cada dia de atraso.\nValor:"+(valor-(valor*((dia_pagamento-dia_vencimento)*0.02))));
		}
	}

}
