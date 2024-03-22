package Unidade3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Uri1010 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int codigo_1 = s.nextInt();
		int qtd_1 = s.nextInt();
		double valor_1 = s.nextDouble();
		int codigo_2 = s.nextInt();
		int qtd_2 = s.nextInt();
		double valor_2 = s.nextDouble();
		s.close();
		DecimalFormat formatado = new DecimalFormat("0.00");
		String total = formatado.format(qtd_1*valor_1+qtd_2*valor_2);
		System.out.println("VALOR A PAGAR: R$ "+total);
	}

}
