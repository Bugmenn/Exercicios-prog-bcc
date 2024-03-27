package Unidade3;

import java.util.Scanner;

public class Uni3Uri1018 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero = s.nextInt();
		int guarda = numero;
		s.close();
		int nota100 = numero/100;
		numero = numero%100;
		int nota50 = numero/50;
		numero = numero%50;
		int nota20 = numero/20;
		numero = numero%20;
		int nota10 = numero/10;
		numero = numero%10;
		int nota5 = numero/5;
		numero = numero%5;
		int nota2 = numero/2;
		numero = numero%2;
		int nota1 = numero/1;
		numero = numero%1;
		System.out.println(guarda+"\n"+nota100+" nota(s) de R$ 100,00\n"+nota50+" nota(s) de R$ 50,00\n"
		+nota20+" nota(s) de R$ 20,00\n"+nota10+" nota(s) de R$ 10,00\n"+nota5+" nota(s) de R$ 5,00\n"
		+nota2+" nota(s) de R$ 2,00\n"+nota1+" nota(s) de R$ 1,00");
	}

}
