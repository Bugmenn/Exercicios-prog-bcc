package Unidade3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Uri1007 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double a = s.nextDouble();
		double b = s.nextDouble();
		s.close();
		DecimalFormat formatado = new DecimalFormat("0.00000");
		String media = formatado.format((a*3.5+b*7.5)/11);
		System.out.println("MEDIA = "+media);
	}

}
