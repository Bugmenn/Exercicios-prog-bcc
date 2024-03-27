package aula_3;

import java.util.Scanner;

public class Execut4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Exe4 contaBancaria = new Exe4();
		
		System.out.print("Escreva o n�mero da conta:");
		contaBancaria.numeroConta = s.nextInt();
		System.out.print("Escreva o saldo:");
		contaBancaria.saldo = s.nextFloat();
		
		System.out.print("Quanto deseja depositar?:");
		System.out.println("Saldo atual:" + contaBancaria.depositar(s.nextFloat()));
		System.out.print("Quanto deseja sacar?:");
		float numero = s.nextFloat();

		s.close();

		if (contaBancaria.saldo < numero) {
			System.out.print("N�o � possivel sacar");
		} else {
			System.out.print("Saldo atual:" + contaBancaria.sacar(numero));
		}
	}
}