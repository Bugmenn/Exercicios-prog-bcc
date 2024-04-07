package Unidade4;

import java.util.Scanner;

public class Uni4Exe19 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe o valor X:");
		double valor_x = s.nextDouble();
		
		System.out.print("Informe o valor Y:");
		double valor_y = s.nextDouble();

		s.close();
		
		if (valor_x==0 && valor_y==0) {
			System.out.println("Quadrante 0");
		} else if (valor_x>0 && valor_y>0) {
		System.out.println("Quadrante 1");
		} else if (valor_x>0 && valor_y<0) {
			System.out.println("Quadrante 2");
		} else if (valor_x<0 && valor_y<0) {
			System.out.println("Quadrante 3");
		} else {
			System.out.println("Quadrante 4");
		}
	}

}
