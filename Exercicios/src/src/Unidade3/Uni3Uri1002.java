package Unidade3;

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Uni3Uri1002 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double raio = s.nextDouble();
		s.close();
		DecimalFormat formatado = new DecimalFormat("0.0000");
		String area = formatado.format(3.14159*Math.pow(raio, 2));
		System.out.println("A="+area);
	}

}
