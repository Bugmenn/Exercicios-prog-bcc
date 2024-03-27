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
		DecimalFormat formatado = new DecimalFormat("0.000");
		String area_triangulo = formatado.format(a*c/2);
		String area_circulo = formatado.format(3.14159*Math.pow(c, 2));
		String area_trapezio = formatado.format(((a+b)*c)/2);
		String area_quadrado = formatado.format(Math.pow(b, 2));
		String area_retangulo = formatado.format(a*b);
		System.out.println("TRIANGULO: "+area_triangulo+"\nCIRCULO: "+area_circulo+"\nTRAPEZIO: "+area_trapezio
		+"\nQUADRADO: "+area_quadrado+"\nRETANGULO: "+area_retangulo);
	}

}
