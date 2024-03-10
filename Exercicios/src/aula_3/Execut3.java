package aula_3;

import java.util.Scanner;

public class Execut3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Exe3 retangulo = new Exe3();
		
		System.out.print("Escreva o comprimento:");
		retangulo.comprimento = s.nextFloat();
		System.out.print("Escreva a largura:");
		retangulo.largura = s.nextFloat();
		
		System.out.println("Per�metro:" + retangulo.calcularPerimetro());
		System.out.print("�rea:" + retangulo.calcularArea());
	}

}