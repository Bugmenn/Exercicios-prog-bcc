package Unidade3;

import java.util.Scanner;

public class Uni3Uri1021 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double numero = s.nextDouble();
		s.close();
		int nota100 = (int)(numero/100);
		numero %= 100;
		int nota50 = (int)numero/50;
		numero %= 50;
		int nota20 = (int)numero/20;
		numero %= 20;
		int nota10 = (int)numero/10;
		numero %= 10;
		int nota5 = (int)numero/5;
		numero %= 5;
		int nota2 = (int)numero/2;
		numero %= 2;
		int moeda1 = (int)numero/1;
		numero %= 1;
		int moeda50 = (int)(numero/0.50);
		numero %= 0.50;
		int moeda25 = (int)(numero/0.25);
		numero %= 0.25;
		int moeda10 = (int)(numero/0.10);
		numero %= 0.10;
		int moeda05 = (int)(numero/0.05);
		numero %= 0.05;
		int moeda01 = (int)(numero/0.01);
		System.out.println("NOTAS:\n"+nota100+" nota(s) de R$ 100.00\n"+nota50+" nota(s) de R$ 50.00\n"
		+nota20+" nota(s) de R$ 20.00\n"+nota10+" nota(s) de R$ 10.00\n"+nota5+" nota(s) de R$ 5.00\n"
		+nota2+" nota(s) de R$ 2.00\n"+"MOEDAS:\n"+moeda1+" moeda(s) de R$ 1.00\n"+moeda50+" moeda(s) de R$ 0.50\n"
		+moeda25+" moeda(s) de R$ 0.25\n"+moeda10+" moeda(s) de R$ 0.10\n"+moeda05+" moeda(s) de R$ 0.05\n"+moeda01
		+" moeda(s) de R$ 0.01");
	}

}
