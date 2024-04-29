package aula_3Parte2;

import java.util.Scanner;

public class Uni3Exe12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe o nome:");
		String nome = s.next();
		
		System.out.print("Informe a quantidade de horas trabalhadas:");
		int hora = s.nextInt();
		
		System.out.print("Informe a quantidade de dependentes:");
		int dependente = s.nextInt();
		
		s.close();
		
		float salario = 10 * hora;
		float salario_desconto = (dependente * 60) + salario - (salario * 0.135f);
		
		
		System.out.println("O sal�rio bruto de "+nome+" � de R$"+salario+" e o "
				+ "sal�rio l�quido � de R$"+salario_desconto);
	}

}