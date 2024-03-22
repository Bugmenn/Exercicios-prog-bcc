package Unidade3;

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Uni3Uri1012 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double a = s.nextDouble();
		double b = s.nextDouble();
		double c = s.nextDouble();
		s.close();
		double area_triangulo = a*c;
		double area_circulo = 3.14159*Math.pow(c, 2);
		double area_trapezio = ((a+b)*c)/2;
		double area_quadrado = Math.pow(b, 2);
		double area_retangulo = a*b;
		//DecimalFormat formatado = new DecimalFormat("0.00");
		//String total = formatado.format(qtd_1*valor_1+qtd_2*valor_2);
		System.out.println("VALOR A PAGAR: R$ "+total);
	}

}
