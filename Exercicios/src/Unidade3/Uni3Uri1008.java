package Unidade3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Uri1008 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero = s.nextInt();
		int horas = s.nextInt();
		double valor = s.nextDouble();
		s.close();
		DecimalFormat formatado = new DecimalFormat("0.00");
		String salario = formatado.format(horas*valor);
		System.out.println("NUMBER = "+numero);
		System.out.println("SALARY = U$ "+salario);
	}

}
