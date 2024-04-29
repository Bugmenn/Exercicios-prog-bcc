package aula_3Parte2;

import java.util.Scanner;
import java.lang.Math;

public class Uni3Exe09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe o raio:");
		float raio = s.nextFloat();
		
		System.out.print("Informe a altura:");
		float altura = s.nextFloat();
		
		s.close();
		
		System.out.println("Volume:" + (Math.PI*(raio*raio)*altura));
	}

}