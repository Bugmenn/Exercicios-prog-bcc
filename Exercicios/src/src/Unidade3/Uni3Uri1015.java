package Unidade3;

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Uni3Uri1015 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double x1 = s.nextDouble();
		double y1 = s.nextDouble();
		double x2 = s.nextDouble();
		double y2 = s.nextDouble();
		s.close();
		DecimalFormat formatado = new DecimalFormat("0.0000");
		String distancia = formatado.format(Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2)));
		System.out.println(distancia);
	}

}
