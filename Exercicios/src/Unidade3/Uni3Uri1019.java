package Unidade3;

import java.util.Scanner;

public class Uni3Uri1019 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero = s.nextInt();
		s.close();
		int segundos = numero-numero/60*60;
		int horas = numero/3600;
		int minutos = (numero-(segundos+horas*3600))/60;
		System.out.println(horas+":"+minutos+":"+segundos);
	}

}
