package Unidade3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Uri1009 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String nome = s.next();
		double salario = s.nextDouble();
		double vendas = s.nextDouble();
		s.close();
		DecimalFormat formatado = new DecimalFormat("0.00");
		String salario_total = formatado.format(salario+vendas*0.15);
		System.out.println("TOTAL = R$ "+salario_total);
	}

}
