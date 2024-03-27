package aula_3_parte_2;

import java.util.Scanner;

public class Uni3Exe03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe o preço da gasolina:");
		float preco = s.nextFloat();
		
		System.out.print("Informe o valor do pagamento");
		float pagamento = s.nextFloat();
		
		s.close();
		
		System.out.println("A quantidade de litros é de:"+(pagamento/preco));
	}

}