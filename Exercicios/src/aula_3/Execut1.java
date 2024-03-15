package aula_3;

import java.util.Scanner;

public class Execut1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Exe1 calculadora = new Exe1();
		
		System.out.print("Escreva o primeiro n�mero:");
		calculadora.numero1 = s.nextFloat();
		System.out.print("Escreva o segundo n�mero:");
		calculadora.numero2 = s.nextFloat();
		
		s.close();

		System.out.println("Adi��o:" + calculadora.adicao());
		System.out.println("Subtra��o:" + calculadora.subtracao());
		System.out.println("Multiplica��o:" + calculadora.multiplicacao());
		System.out.println("Divis�o:" + calculadora.divisao());		
	}

}