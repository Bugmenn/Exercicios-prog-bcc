package Unidade4;

import java.util.Scanner;

public class Uni4Exe07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe o peso da carta:");
		int peso = s.nextInt();

		s.close();

		double valor = 0;
		
		if (peso <= 50) {
			valor = 0.45;
		} else {
			double excedido = peso-50;
			double qt_adicional = (excedido/20);
			valor = 0.45 + 0.45 * qt_adicional;
		}

		System.out.println("Custo do selo:"+valor);
	}

}
