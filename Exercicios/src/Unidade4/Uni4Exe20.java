package Unidade4;

import java.util.Scanner;

public class Uni4Exe20 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe a nota da 1° prova:");
		double prova1 = s.nextDouble();
		
		System.out.print("Informe a nota da 2° prova:");
		double prova2 = s.nextDouble();

		System.out.print("Informe a nota da 3° prova:");
		double prova3 = s.nextDouble();

		System.out.print("Informe a média dos exercícios:");
		double media_exer = s.nextDouble();

		s.close();
		
		double media = (prova1+prova2*2+prova3*3+media_exer)/7;

		if (media>=9) {
			System.out.println("Média de aproveitamento:"+media+"\nConceito:A\nAprovado");
		} else if (media>=7.5 && media<9) {
			System.out.println("Média de aproveitamento:"+media+"\nConceito:B\nAprovado");
		} else if (media>=6 && media<7.5) {
			System.out.println("Média de aproveitamento:"+media+"\nConceito:C\nAprovado");
		} else if (media>=4 && media<6) {
			System.out.println("Média de aproveitamento:"+media+"\nConceito:D\nReprovado");
		} else {
			System.out.println("Média de aproveitamento:"+media+"\nConceito:E\nReprovado");
		}
	}

}
