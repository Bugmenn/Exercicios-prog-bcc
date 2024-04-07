package Unidade4;

import java.util.Scanner;

public class Uni4Exe27 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe a hora de entrada:");
		int entrada_hora = s.nextInt();
		int entrada_minuto = s.nextInt();

		System.out.print("Informe a hora de saída:");
		int saida_hora = s.nextInt();
		int saida_minuto = s.nextInt();
		
		int tempo_hora = (saida_hora-entrada_hora);
		int tempo_minuto = (saida_minuto-entrada_minuto);

		s.close();
		
		if (entrada_hora>24 || entrada_hora<0 || entrada_minuto<0 || entrada_minuto>59
		|| saida_hora<entrada_hora || saida_minuto<0 || saida_minuto>59) {
			System.out.println("Valores invalidos");
		} else {
			System.out.println("Ficou estacionado por:"+tempo_hora+" "+tempo_minuto);
			if (tempo_minuto>=30) {
				tempo_hora++;
			}
			if (tempo_hora>=1 && tempo_hora<=2) {
				System.out.println("Deve pagar R$"+5*tempo_hora);
			} else if (tempo_hora>=3 && tempo_hora<=4) {
				System.out.println("Deve pagar R$"+7.5*tempo_hora);
			} else {
				System.out.println("Deve pagar R$"+10*tempo_hora);
			}
		}
	}

}
