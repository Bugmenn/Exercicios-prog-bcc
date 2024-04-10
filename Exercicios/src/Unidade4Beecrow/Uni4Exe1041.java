package Unidade4Beecrow;

import java.util.Scanner;

public class Uni4Exe1041 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double numeroX = s.nextDouble();
		double numeroY = s.nextDouble();
		
		s.close();
		
		if (numeroX>0 && numeroY>0) {
			System.out.println("Q1");
		} else if (numeroX<0 && numeroY>0) {
			System.out.println("Q2");
		} else if (numeroX<0 && numeroY<0) {
			System.out.println("Q3");
		} else if (numeroX>0 && numeroY<0) {
			System.out.println("Q4");
		} else if (numeroX==0 && numeroY!=0) {
			System.out.println("Eixo X");
		} else if (numeroX!=0 && numeroY==0) {
			System.out.println("Eixo Y");
		} else {
			System.out.println("Origem");
		}
	}

}
