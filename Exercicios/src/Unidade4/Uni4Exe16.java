package Unidade4;

import java.util.Scanner;

public class Uni4Exe16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe a idade do 1° homem:");
		int idade_homem1 = s.nextInt();
		
		System.out.print("Informe a idade do 2° homem:");
		int idade_homem2 = s.nextInt();

		System.out.print("Informe a idade da 1° mulher:");
		int idade_mulher1 = s.nextInt();

		System.out.print("Informe a idade da 2° mulher:");
		int idade_mulher2 = s.nextInt();

		s.close();
		
		int soma_velho_nova = 0;
		int soma_novo_velha = 0;

		if (idade_homem1>idade_homem2 && idade_mulher1<idade_mulher2) {
			soma_velho_nova = idade_homem1+idade_mulher1;
			soma_novo_velha = idade_homem2+idade_mulher2;
		} else if (idade_homem1>idade_homem2 && idade_mulher2<idade_mulher1) {
			soma_velho_nova = idade_homem1+idade_mulher2;
			soma_novo_velha = idade_homem2+idade_mulher1;
		} else if (idade_homem2>idade_homem1 && idade_mulher1<idade_mulher2) {
			soma_velho_nova = idade_homem2+idade_mulher1;
			soma_novo_velha = idade_homem1+idade_mulher2;
		} else {
			soma_velho_nova = idade_homem2+idade_mulher2;
			soma_novo_velha = idade_homem1+idade_mulher1;
		}
		System.out.println("Soma das idades do homem mais "+
		"velho com a mulher mais nova:"+(soma_velho_nova));
		System.out.println("Soma das idades do homem mais "+
		"novo com a mulher mais velha:"+(soma_novo_velha));
	}

}
