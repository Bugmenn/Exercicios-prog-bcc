package Unidade4;

import java.util.Scanner;

public class Uni4Exe17 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe a renda anual:");
		double renda_anual = s.nextDouble();
		
		System.out.print("Informe o número de dependentes do contribuinte:");
		int qt_dependentes = s.nextInt();

		s.close();
		
		double renda_liquida = renda_anual-(renda_anual*(0.02*qt_dependentes));

		if (renda_liquida<=2000.00) {
			System.out.println("Não paga imposto:"+renda_liquida);
		} else if (renda_liquida>2000.00 && renda_liquida<=5000.00) {
			System.out.println("Imposto de 5%:"+(renda_liquida-(renda_liquida*0.05)));
		} else if (renda_liquida>5000.00 && renda_liquida<=10000.00) {
			System.out.println("Imposto de 10%:"+(renda_liquida-(renda_liquida*0.10)));
		} else {
			System.out.println("Imposto de 15%:"+(renda_liquida-(renda_liquida*0.15)));
		}
	}

}
