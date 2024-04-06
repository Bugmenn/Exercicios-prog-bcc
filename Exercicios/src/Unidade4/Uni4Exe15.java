package Unidade4;

import java.util.Scanner;

public class Uni4Exe15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe a quantidade des mêses:");
		int meses = s.nextInt();
	
		s.close();
		
		if (meses<=12) {
			System.out.println("O reajuste é de %5");
		} else {
			System.out.println("O reajuste é de %7");
		}
	}

}
