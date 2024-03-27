package aula_3;

import java.util.Scanner;

public class Execut5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Exe5 produto = new Exe5();
		
		System.out.print("Escreva o nome do produto:");
		produto.nome = s.nextLine();

		System.out.print("Escreva o preço:");
		produto.preco = s.nextFloat();

		System.out.print("Informe a quantidade:");
		produto.quantidade = s.nextInt();

		System.out.print("Informe a quantidade que deseja remover:");
		produto.remover(s.nextInt());
		System.out.println("Quantidade atual:"+produto.quantidade);
		
		System.out.print("Informe a quantidade que deseja adicionar:");
		produto.adicionar(s.nextInt());
		System.out.println("Quantidade atual:"+produto.quantidade);

		System.out.print("Preço do estoque atual:"+produto.calcularEstoque());
		s.close();
	}

}