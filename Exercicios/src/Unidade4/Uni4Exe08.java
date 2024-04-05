package Unidade4;

import java.util.Scanner;

public class Uni4Exe08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe a letra:");
		String letra = s.nextLine();

		s.close();
		
		String vogais = "aeiou";

		if (vogais.contains(letra)) {
			System.out.println("É vogal");
		} else {
			System.out.println("NÃO é vogal");
		}
	}

}
